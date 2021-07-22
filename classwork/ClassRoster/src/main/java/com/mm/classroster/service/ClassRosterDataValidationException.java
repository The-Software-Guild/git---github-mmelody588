/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/22/2021
 * purpose: Data Validation Exception Class for Class Roster Project
 */
package com.mm.classroster.service;

public class ClassRosterDataValidationException extends Exception{
    public ClassRosterDataValidationException(String message) {
        super(message);
    }

    public ClassRosterDataValidationException(String message,
            Throwable cause) {
        super(message, cause);
    }
}
