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
public class StringsExerciseC {
    /**
     * Take a word, and remove all its vowels and returns it.
     *
     * Ex:
     * removeTheVowels( "truncate" ) ->  "trnct"
     * removeTheVowels( "squashed" ) ->  "sqshd"
     * removeTheVowels( "compressed" ) ->  "cmprssd"
     * @param word
     * @return String
     */
    public static String removeTheVowels(String word){
        return word.replace("aeiou", "");
    }
}
