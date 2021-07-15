/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.2 For Spring Forward Fall Back
 */
package com.mm.foundations.flowcontrol.fors;

public class SpringForwardFallBack {
    public static void main(String[] args) {

        System.out.println("It's Spring...!");
        // This loop will output numbers 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }

        // This loop will output numbers 1 to 10 in descending order
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        // I don't see a way to alter the first loop using ONLY the start or stop point
    }
}
