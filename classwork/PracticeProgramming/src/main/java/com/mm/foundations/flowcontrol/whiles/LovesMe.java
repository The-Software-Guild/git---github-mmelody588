/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 6.5 Loves Me
 */
package com.mm.foundations.flowcontrol.whiles;

public class LovesMe {
    public static void main(String[] args) {
        int petals = 9;
        boolean lovesMe = false;
        System.out.println("Well here goes nothing...");
        // I used a while loop, mostly because I'm more used to using them than do-while loops
        while(petals > 0){
            lovesMe = !lovesMe;
            if(lovesMe == true){
                System.out.println("It LOVES me!");
            } else {
                System.out.println("It loves me NOT!");
            }
            petals--;
        }
        if(lovesMe == true){
            System.out.println("I knew it! It LOVES ME!");
        } else {
            System.out.println("Oh darn. It doesn't love me...");
        }
    }
}
