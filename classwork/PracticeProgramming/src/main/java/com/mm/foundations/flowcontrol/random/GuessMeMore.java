/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 5.6 Guess Me More
 */
package com.mm.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int answer = rand.nextInt();
        int guess;
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.println("Your guess: ");
        guess = Integer.parseInt(scan.nextLine());
        
        if(guess == answer){
            System.out.println("Wow, nice guess! That was it!");
        }else{
            System.out.print("Ha, nice try - ");
            if(guess < answer){
                System.out.println("too low! Try again!");
            } else {
                System.out.println("too high! Try again!");
            }
            System.out.println("Your guess: ");
            guess = Integer.parseInt(scan.nextLine());
            if(guess == answer){
                System.out.println("Wow, nice guess! That was it!");
            }else{
                System.out.print("Ha, nice try - ");
                if(guess < answer){
                    System.out.println("too low!");
                } else {
                    System.out.println("too high!");
                }
                System.out.println("The answer is " + answer);
            }
        }
    }
}
