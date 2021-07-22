/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/22/2021
 * purpose: Duplicate ID Exception Class for Class Roster Project
 */
package com.mm.classroster.service;

public class ClassRosterDuplicateIdException extends Exception {
    public ClassRosterDuplicateIdException(String message) {
        super(message);
    }

    public ClassRosterDuplicateIdException(String message,
            Throwable cause) {
        super(message, cause);
    }
}
