/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 4.7 Knock Knock
 */
package com.mm.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        // If ".equals()" is changed to "==", the program still compiles,
        // but the condition is false even if the Strings match
        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
        /* If improrer capitalization is used, the strings won't match.
        *  A potential fix is to use the toUpperCase() or toLowerCase() String methods.
        *  This will convert the string to all uppercase or all lowercase letters
        * Then they will match i.e. nameGuess = nameGuess.toLowerCase()
        * alternatively use equalsIgnoreCase() instead of equals()
        */
    }
}
