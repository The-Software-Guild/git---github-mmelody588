/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 6.3 RollerCoaster
 */
package com.mm.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        int loopsLooped = 0;
        /* When a value other than "y" or "n" is entered,
            The loop will be exited, as the input must be "y"
            for it to continue
        */
        while (!keepRiding.equals("n")) { //keepRiding.equals("y")
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }
        /*
        If we change the condition to check for a negative answer instead,
        then the loop will only exit if we enter "n".
        Any other input will continue the loop
        */

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
}
