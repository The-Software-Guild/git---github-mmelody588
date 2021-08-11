/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.todoapi.servicelayer;

import com.mm.todoapi.data.ToDoDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceLayerTest {
    
    private ServiceLayer serviceTest;
    
    @Autowired
    public ServiceLayerTest() {
        ToDoDao tester = new StubDAOTest();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deleteById method, of class ServiceLayer.
     */
    @Test
    public void testDelete() {
        //assertTrue(serviceTest.deleteById(42));
        //assertFalse(serviceTest.deleteById(24));
    }

    /**
     * Test of complete method, of class ServiceLayer.
     */
    @Test
    public void testComplete() {
        //serviceTest.complete(24, "DAO STUB TEST");
        //serviceTest.complete(42, "DAO STUB TEST");
        //serviceTest.complete(1, "DAO STUB TEST");
    }

    /**
     * Test of redo method, of class ServiceLayer.
     */
    @Test
    public void testRedo() {
        //serviceTest.redo(42);
        //serviceTest.redo(50);
    }
    
}
