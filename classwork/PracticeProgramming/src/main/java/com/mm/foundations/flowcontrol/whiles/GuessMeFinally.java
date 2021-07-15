/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 6.7 Guess Me Finally
 */
package com.mm.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int answer = rand.nextInt(201)-100;
        int guess = -101;
        int attempts = 0;
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        while(true){
            System.out.print("Your guess: ");
            guess = Integer.parseInt(in.nextLine());
            if(guess == answer){
                break;
            } else if(guess < answer){
                System.out.println("Ha, nice try - too low! Try again!");
            } else {
                System.out.println("Too bad, way too high. Try again!");
            }
            attempts++;
        }
        if(attempts == 0){
            System.out.println("Wow, nice guess! That was it!");
        }else{
            System.out.println("Finally! It's about time you got it!");
        }
    }
}
