/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.unittesting.strings;

/**
 *
 * @author mmelo
 */
public class StringsExerciseE {
    /**
     * Take in two Strings - return true if either String 'contains' the other... 
     * but false if they are exactly equal, or completely different.
     *
     * Ex:
     * containsTheOther( "one", "tone" ) ->  true
     * containsTheOther( "same", "same" ) ->  false
     * containsTheOther( "fancypants", "pants" ) ->  true
     * containsTheOther( "llama", "duck" ) ->  false
     * 
     * @param one
     * @param two
     * @return boolean
     */
    public static boolean containsTheOther(String one, String two){
        if(one.equals(two)) return false;
        if(one.contains(two) || two.contains(one)) return true;
        return false;
    }
}
