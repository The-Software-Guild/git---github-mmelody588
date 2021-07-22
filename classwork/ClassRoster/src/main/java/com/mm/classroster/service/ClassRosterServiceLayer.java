/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/22/2021
 * purpose: Service Layer Interface for Class Roster Project
 */
package com.mm.classroster.service;

import com.mm.classroster.dao.ClassRosterPersistenceException;
import com.mm.classroster.dto.Student;
import java.util.List;

public interface ClassRosterServiceLayer {
    void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException;
 
    List<Student> getAllStudents() throws
            ClassRosterPersistenceException;
 
    Student getStudent(String studentId) throws
            ClassRosterPersistenceException;
 
    Student removeStudent(String studentId) throws
            ClassRosterPersistenceException;
}
