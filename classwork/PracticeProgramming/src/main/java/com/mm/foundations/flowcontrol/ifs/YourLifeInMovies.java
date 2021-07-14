/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 4.3 Your Life In Movies
 */
package com.mm.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        String name;
        int yearBorn;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hey, let's play a game! What's your name? ");
        name = in.nextLine();
        
        System.out.println("Ok, " + name + ", when were you born? ");
        yearBorn = Integer.parseInt(in.nextLine());
        
        System.out.println("Well " + name + "...");
        if(yearBorn < 2005){
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        if(yearBorn < 1995){
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        if(yearBorn < 1985){
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        if(yearBorn < 1975){
            System.out.println("Plus, the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if(yearBorn < 1965){
            System.out.println("Finally, the MASH TV series has been around for almost half a century!");
        }
    }
}
