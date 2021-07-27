/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author mmelo
 */
public class NewEmptyJUnitTest extends TestCase{
    
    public NewEmptyJUnitTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception{
        super.tearDown();
    }
    
    public void testHello(){
        boolean shouldBeTrue = true;
        
        assertTrue(shouldBeTrue);
    }
    
    public void testIO(){
        String number5 = "5";
        
        assertEquals(number5, "5", "checking string five");
    }
}
