/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 3.4 All The Trivia
 */
package com.mm.foundations.userinput;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {
        String giga;
        String clockwise;
        String volcano;
        String atmosphere;
        Scanner in = new Scanner(System.in);
        
        System.out.print("What unit is equivalent to 1,024 Gigabytes? ");
        giga = in.nextLine();
        System.out.print("Which planet is the only one that rotates clockwise in our Solar System? ");
        clockwise = in.nextLine();
        System.out.print("The largest volcano ever discovered in our Solar System is located on which planet? ");
        volcano = in.nextLine();
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        atmosphere = in.nextLine();
        
        System.out.println("Wow, 1,024 Gigabytes is a " + volcano + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + giga + "!");
        System.out.println("That's amazing that " + clockwise + " is the most abundant element in the atmosphere...");
        System.out.println(atmosphere + " is the only planet that rotates clockwise, neat!");
    }
}
