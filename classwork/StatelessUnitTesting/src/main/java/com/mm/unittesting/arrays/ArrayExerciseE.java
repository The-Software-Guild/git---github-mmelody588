/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.unittesting.arrays;

/**
 *
 * @author mmelo
 */
public class ArrayExerciseE {
    /**
     * Given an array of words turn it into a single camelCased phrase.
     * Lower case the first word, capitalize the first letter (but only the first) of the rest.
     *
     * camelCaseIt( {"llama", "llama", "duck"}  ) ->  "llamaLlamaDuck"
     * camelCaseIt( {"lambs", "eat", "oats", "and", "does", "eat", "oats"}  ) ->  "lambsEatOatsAndDoesEatOats"
     * camelCaseIt( {"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"}  ) ->  "doOrDoNotThereIsNoTry"
     * @param words
     * @return String camelCased phrase
     */

    public static String camelCaseIt(String[] words){
        String camel = words[0].toLowerCase();
        for(int i = 1; i < words.length; i++){
            camel += words[i].substring(0,1).toUpperCase() 
                + words[i].substring(1).toLowerCase();
        }
        return camel;
    }
}
