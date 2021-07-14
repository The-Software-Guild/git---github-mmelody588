/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 3.7 Healthy Hearts
 */
package com.mm.foundations.userinput;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        int age;
        int max;
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        age = Integer.parseInt(in.nextLine());
        max = 220-age;
        
        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        System.out.println("Your target HR Zone is " + (max/2) + " - " + (17*max/20) + " beats per minute");
    }
}
