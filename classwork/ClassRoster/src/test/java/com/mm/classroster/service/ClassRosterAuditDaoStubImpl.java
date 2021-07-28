/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.classroster.service;

import com.mm.classroster.dao.ClassRosterAuditDao;
import com.mm.classroster.dao.ClassRosterPersistenceException;
import com.mm.classroster.dto.Student;

public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao {
    Student oneOne;
    
    @Override
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException {
        //do nothing . . .
    }
}
