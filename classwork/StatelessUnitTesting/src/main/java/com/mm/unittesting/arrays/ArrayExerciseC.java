/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.unittesting.arrays;

import java.util.Arrays;

/**
 *
 * @author mmelo
 */
public class ArrayExerciseC {
    /**
     * Given an array of integers, return them all as a single continuous text value.
     * 
     * stringThemTogether( { 1, 3, 3, 7 }  ) ->  "1337"
     * stringThemTogether( { 1, 33, 555, 7777, 99999 } ) ->  "133555777799999"
     * stringThemTogether( { }  ) ->  ""
     * 
     * @param nums
     * @return String
     */
    public String stringThemTogether(int[] nums){
        return Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
    }
}
