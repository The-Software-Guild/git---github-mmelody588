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
public class StringsExerciseB {
    /**
     * Triples your String input and returns it.
     * However, make the first instance lowercase, the second uppercase, 
     * and third and final lowercase - just to mix things up!
     *
     * Ex:
     * tripleIt( "Llama" ) ->  "llamaLLAMAllama"
     * tripleIt( "ha" ) ->  "haHAha"
     * tripleIt( "Beetlejuice" ) ->  "beetlejuiceBEETLEJUICEbeetlejuice"
     * @param theString
     * @return String triple trouble
     */
    public static String tripleIt(String theString){
        return theString.toLowerCase() + theString.toUpperCase() + theString.toLowerCase();
    }
}
