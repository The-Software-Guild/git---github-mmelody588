/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.unittesting;

import static com.mm.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class eXERCISEa {
    /*
    TEST CASES:
         * Example Results:
     * maxOfArray( {1} ) -> 1
     * maxOfArray( {3,4,5} ) -> 5
     * maxOfArray( {-9000, -700, -50, -3} ) -> -3
     *
    */
    
    public eXERCISEa(){
        
    }
    
    @Test
    public void testMaxSingleArray(){
        int[] test1 = {1};
        
        int result = maxOfArray(test1);
        
        assertEquals(1, result,"This should be 1");
    }
    
    @Test
    public void testMaxAllPositiveNums(){
        int[] test2 = {3, 4, 5};
        
        int result = maxOfArray(test2);
        
        assertEquals(5, result,"This should be 5");
    }
    
    @Test
    public void testMaxAllNegativeNums(){
        int[] test3 = {-9000, -700, -50, -3};
        
        int result = maxOfArray(test3);
        
        assertEquals(-3, result,"This should be -3");
    }
}
