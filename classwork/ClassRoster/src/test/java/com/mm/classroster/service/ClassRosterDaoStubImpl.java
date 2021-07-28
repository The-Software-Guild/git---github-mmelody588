/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/28/2021
 * purpose: DAO Test Cases for Class Roster project
 */
package com.mm.classroster.service;

import com.mm.classroster.dao.ClassRosterDao;
import com.mm.classroster.dao.ClassRosterPersistenceException;
import com.mm.classroster.dto.Student;
import java.util.ArrayList;
import java.util.List;

public class ClassRosterDaoStubImpl implements ClassRosterDao {
    public Student onlyStudent;

    public ClassRosterDaoStubImpl() {
        onlyStudent = new Student("0001");
        onlyStudent.setFirstName("Ada");
        onlyStudent.setLastName("Lovelace");
        onlyStudent.setCohort("Java-May-1845");
    }

    public ClassRosterDaoStubImpl(Student testStudent){
         this.onlyStudent = testStudent;
     }

    @Override
    public Student addStudent(String studentId, Student student)
                  throws ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }

    @Override
    public List<Student> getAllStudents()
                 throws ClassRosterPersistenceException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(onlyStudent);
        return studentList;
    }

    @Override
    public Student getStudent(String studentId)
                throws ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }       
    }

    @Override
    public Student removeStudent(String studentId)
                throws ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }   
}
