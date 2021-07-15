/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 6.9 Lazy Teenager
 */
package com.mm.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        Random rand = new Random();
        int chance;
        int timesTold = 1;
        do{
            System.out.println("Clean your room!! (" + timesTold + "x)");
            chance = rand.nextInt(100);
            if(chance < (timesTold*10)){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }
            timesTold++;
            if(timesTold > 7){
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        }while(true);
    }
}
