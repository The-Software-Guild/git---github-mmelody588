/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.unittesting.logic;

/**
 *
 * @author mmelo
 */
public class LogicExerciseD {
    /**
     * Given two characters, return true if the first letter parameter comes 
     * earlier in the alphabet than the second letter parameter. 
     * Don't worry about casing, just turn consider everything in lowercase.
     *
     * Ex:
     * isFirstTheFirst( 'a' , 'b'  ) ->  true
     * isFirstTheFirst( 'O' , 'X'  ) ->  true
     * isFirstTheFirst( 'Z' , 'z'   ) -> false
     * 
     * @param letterOne
     * @param letterTwo
     * @return boolean
     */
    public static boolean isFirstTheFirst(char letterOne, char letterTwo) {
        if(Character.toLowerCase(letterOne) < Character.toLowerCase(letterTwo))
            return true;
        return false;
    }
}
