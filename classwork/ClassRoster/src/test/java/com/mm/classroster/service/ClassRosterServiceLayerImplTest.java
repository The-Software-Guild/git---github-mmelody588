/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/29/2021
 * purpose: Service Layer Test Cases for Class Roster project
 */
package com.mm.classroster.service;

import com.mm.classroster.dao.ClassRosterPersistenceException;
import com.mm.classroster.dto.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassRosterServiceLayerImplTest {
    
    private ClassRosterServiceLayer service;
    
    public ClassRosterServiceLayerImplTest() {
        /*ClassRosterDao dao = new ClassRosterDaoStubImpl();
        ClassRosterAuditDao auditDao = new ClassRosterAuditDaoFileImpl();
        
        service = new ClassRosterServiceLayerImpl(dao, auditDao);*/
        
        ApplicationContext ctx = 
            new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        service = 
            ctx.getBean("service", ClassRosterServiceLayer.class);
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCreateValidStudent() {
        // ARRANGE
        Student student = new Student("0002");
        student.setFirstName("Charles");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1845");
        // ACT
        try {
            service.createStudent(student);
        } catch (ClassRosterDuplicateIdException
            | ClassRosterDataValidationException
            | ClassRosterPersistenceException e) {
        // ASSERT
            fail("Student was valid. No exception should have been thrown.");
        }
    }
    
    @Test
    public void testCreateDuplicateIdStudent() {
        // ARRANGE
        Student student = new Student("0001");
        student.setFirstName("Charles");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1845");

        // ACT
        try {
            service.createStudent(student);
            fail("Expected DupeId Exception was not thrown.");
        } catch (ClassRosterDataValidationException
            | ClassRosterPersistenceException e) {
        // ASSERT
            fail("Incorrect exception was thrown.");
        } catch (ClassRosterDuplicateIdException e){
            return;
        }
    }
    
    @Test
    public void testCreateStudentInvalidData() throws Exception {
        // ARRANGE
        Student student = new Student("0002");
        student.setFirstName("");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1845");

        // ACT
        try {
            service.createStudent(student);
            fail("Expected ValidationException was not thrown.");
        } catch (ClassRosterDuplicateIdException
            | ClassRosterPersistenceException e) {
        // ASSERT
            fail("Incorrect exception was thrown.");
        } catch (ClassRosterDataValidationException e){
            return;
        }  
    }
    
    @Test
    public void testGetAllStudents() throws Exception {
        // ARRANGE
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");

        // ACT & ASSERT
        assertEquals("Should only have one student.",
                1, service.getAllStudents().size());
        assertTrue("The one student should be Ada.",
                service.getAllStudents().contains(testClone));
    }
    
    @Test
    public void testGetStudent() throws Exception {
        // ARRANGE
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");

        // ACT & ASSERT
        Student shouldBeAda = service.getStudent("0001");
        assertNotNull("Getting 0001 should be not null.", shouldBeAda);
        assertEquals("Student stored under 0001 should be Ada.",
                testClone, shouldBeAda);

        Student shouldBeNull = service.getStudent("0042");    
        assertNull("Getting 0042 should be null.", shouldBeNull);
    }
    
    @Test
    public void testRemoveStudent() throws Exception {
        // ARRANGE
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");

        // ACT & ASSERT
        Student shouldBeAda = service.removeStudent("0001");
        assertNotNull("Removing 0001 should be not null.", shouldBeAda);
        assertEquals("Student removed from 0001 should be Ada.", 
                testClone, shouldBeAda);

        Student shouldBeNull = service.removeStudent("0042");    
        assertNull("Removing 0042 should be null.", shouldBeNull);
    }
}
