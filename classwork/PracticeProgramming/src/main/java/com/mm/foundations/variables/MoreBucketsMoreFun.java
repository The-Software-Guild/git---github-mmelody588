/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 2.2 More Buckets More Fun
 */
package com.mm.foundations.variables;

public class MoreBucketsMoreFun {
    public static void main(String[] args) {

        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;

        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        //We use a decrement operator on the butterfly variable to show that the dog ate one
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        //The actual bugs variable has not had its value changed, so it still displays the first amount
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }
}
