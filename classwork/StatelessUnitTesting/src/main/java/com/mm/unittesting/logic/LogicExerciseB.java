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
public class LogicExerciseB {
    /**
     * Given a number, return the 'place rank' word associated with it.
     * I.e. pretend you're ranking folks running in a race from the order they
     * arrived at the finish line. Assume nonzero, positive inputs! 
     * Also, start by going up to 100, but stretch to more if you can!
     *
     * Ex:
     * placeOf( 1 ) ->   "1st"
     * placeOf( 3 ) ->   "3rd"
     * placeOf( 22 ) ->   "22nd"
     *
     * @param place
     * @return String
     */
    public String placeOf(int place) {
        String position;
        int digit = place % 10;
        switch(digit){
            case 1:
                position = place + "st";
                break;
            case 2:
                position = place + "nd";
                break;
            case 3:
                position = place + "rd";
                break;
            default:
                position = place + "th";
                break;
        }
        return position;
    }
}
