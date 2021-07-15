/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Cumulative Exercise 4: SummativeSums
 */
package com.mm.foundations.cumulative;

public class SummativeSums {
    public static void main(String[] args) {
        int[] a1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] a2 = { 999, -60, -77, 14, 160, 301 };
        int[] a3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 };
        
        System.out.println("Sum of first array: " + sum(a1));
        System.out.println("Sum of second array: " + sum(a2));
        System.out.println("Sum of final array: " + sum(a3));
    }
    
    static int sum(int[] adder){
        int x = 0;
        for(int i=0; i < adder.length; i++){
            x += adder[i];
        }
        return x;
    }
}
