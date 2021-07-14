/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Basic variable storage program 2.4
 */
package com.mm.foundations.variables;

public class AllAboutMe {
    public static void main(String[] args) {
        String name = "Jeremy Smith";
        String favoriteFood = "chicken fried rice";
        int numPets = 3;
        String domicile = "a beachside condo";
        boolean canWhistle = true;
        
        System.out.println("My name is " + name + ".");
        System.out.println("My favorite food is " + favoriteFood + ".");
        System.out.println("I have " + numPets + " pets.");
        System.out.println("I live in " + domicile + ", and I love it here.");
        System.out.print("It is true ");
        if(canWhistle == true){
            System.out.println("I know how to whistle.");
        } else {
            System.out.println("I don't know how to whistle");
        }
    }
}
