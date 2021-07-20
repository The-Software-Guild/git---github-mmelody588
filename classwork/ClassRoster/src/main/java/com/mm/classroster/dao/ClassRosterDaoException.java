/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/19/2021
 * purpose: DAO Exception class for Class Roster Project
 */
package com.mm.classroster.dao;

public class ClassRosterDaoException extends Exception {
    public ClassRosterDaoException(String message) {
        super(message);
    }
    
    public ClassRosterDaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
