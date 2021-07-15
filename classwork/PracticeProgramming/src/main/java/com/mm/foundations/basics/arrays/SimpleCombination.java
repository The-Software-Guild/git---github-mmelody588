/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 9.4 Simple Combination
 */
package com.mm.foundations.basics.arrays;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];

        // Combining code should go here!
        int i;
        for(i = 0; i < wholeNumbers.length; i++){
            if(i <= 11){
                wholeNumbers[i] = firstHalf[i];
            }else {
                wholeNumbers[i] = secondHalf[i-12];
            }
        }
        // Printing code should go here
        System.out.println("All together now!:");
        for(i = 0; i < wholeNumbers.length; i++){
            System.out.print(wholeNumbers[i] + " ");
        }
    }
}
