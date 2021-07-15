/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 4.4 Space Rustlers
 */
package com.mm.foundations.flowcontrol.ifs;

public class SpaceRustlers {
    public static void main(String[] args) {

        int spaceships = 100;
        int aliens = 200;
        int cows = 100;
        // if checks against a condition, and only runs the code inside if that condition is true
        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        // else if is like if, but only checks the condition if the initial if-block's condition was false
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        // if you remove 'else' from 'else if', the block will check the condition regardless of
        // whether or not the initial if-block was false
        if(aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else {
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now");
        }
    }
}
