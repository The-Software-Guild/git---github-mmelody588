/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/19/2021
 * purpose: Controller for Class Roster Project
 */
package com.mm.classroster.controller;

import com.mm.classroster.dao.ClassRosterDao;
import com.mm.classroster.dao.ClassRosterDaoException;
import com.mm.classroster.dao.ClassRosterDaoFileImpl;
import com.mm.classroster.dto.Student;
import com.mm.classroster.ui.ClassRosterView;
import com.mm.classroster.ui.UserIO;
import com.mm.classroster.ui.UserIOConsoleImpl;
import java.util.List;

public class ClassRosterController {
    private ClassRosterView view;
    private ClassRosterDao dao;
    
    public ClassRosterController(ClassRosterDao dao, ClassRosterView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try{
            while (keepGoing) {
            
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        }catch(ClassRosterDaoException crde){
            view.displayErrorMessage(crde.getMessage());
        }
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createStudent() throws ClassRosterDaoException {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }
    
    private void listStudents() throws ClassRosterDaoException {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }
    
    private void viewStudent() throws ClassRosterDaoException {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        view.displayStudent(student);
    }
    
    private void removeStudent() throws ClassRosterDaoException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
