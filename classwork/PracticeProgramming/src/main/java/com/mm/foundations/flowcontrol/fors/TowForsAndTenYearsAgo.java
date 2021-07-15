/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.6 Two Fors and Ten Years Ago
 */
package com.mm.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TowForsAndTenYearsAgo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();

        //The range is from 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }

        System.out.println("\nI can count backwards using a different way too...");

        // The range is from the year input by the user to 10 years before then, inclusive
        for (int i = year; i >= year - 20; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
        
        //The first is clearer as the initial conditions don't rely on a variable
    }
}
