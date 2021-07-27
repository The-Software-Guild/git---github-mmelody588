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
public class StringsExerciseD {
    /**
     * Given a phrase string - turns the whole thing around.
     * Return the original, but totally backwards to forwards!
     *
     * 
     * Ex:
     * simpleReverse( "fun times" ) ->  "semit nuf"
     * simpleReverse( "llama llama duck" ) ->  "kcud amall amall"
     * simpleReverse( "hannah" ) ->  "hannah"
     * 
     * @param phrase
     * @return String backwards
     */
    public static String simpleReverse(String phrase){
        StringBuilder sb = new StringBuilder(phrase);
        sb.reverse();
        return sb.toString();
    }
}
