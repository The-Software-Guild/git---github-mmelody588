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
public class ArrayExerciseA {
    /**
     * Given an array of ints, find and return the maximum value.
     * 
     * Example Results:
     * maxOfArray( {1}  ) ->  1
     * maxOfArray( {3,4,5}  ) ->  5
     * maxOfArray( {-9000, -700, -50, -3}  ) ->  -3
     * 
     * @param numbers array of integers
     * @return int max
     */
    public static int maxOfArray(int[] numbers){
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(max < numbers[i])
                max = numbers[i];
        }
        return max;
    }
}
