/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 6.4 Do Or Do Not
 */
package com.mm.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class DoOrDoNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        /*
        Entering "y" prints out "I did it!"
        Entering "n" prints "I know you said not to ... but I totally did anyways."
        */
        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;
        /*
        do {
            iDidIt = true;
            break;
        } while (doIt);
        */
        
        /*
        Entering "y" prints out "I did it!"
        Entering "n" prints "Don't look at me, I didn't do anything!"
        */
        while(doIt){
            iDidIt = true;
            break;
        }
        
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
}
