/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 4.2 Guess Me
 */
package com.mm.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        int answer = 7;
        int guess;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");
        guess = Integer.parseInt(scan.nextLine());
        
        if(guess == answer){
            System.out.println("Wow, nice guess! That was it!");
        } else if (guess < answer){
            System.out.println("Ha, nice try - too low! I chose " + answer +".");
        }else {
            System.out.println("Too bad, way too high. I chose "+ answer + ".");
        }
    }
}
