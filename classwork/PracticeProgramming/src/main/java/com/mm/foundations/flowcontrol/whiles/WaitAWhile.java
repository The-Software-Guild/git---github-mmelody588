/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Exercise 6.1 Wait A While
 */
package com.mm.foundations.flowcontrol.whiles;

public class WaitAWhile {
    public static void main(String[] args) {
        // when bedTime is changed to 11, the while loop runs for one more iteration
        int timeNow = 11;
        int bedTime = 10;
        
        // when timeNow is set to 11 and bedTime to 10, the condition is initially false
        // and the loop is not entered.
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        // if timeNow++ is commented out, then timeNow never changes, the condition
        // never becomes false, and the loop runs infinitely
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
