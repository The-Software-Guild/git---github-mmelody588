/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 5.4 High Roller
 */
package com.mm.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        Scanner scan = new Scanner(System.in);
        int sides;
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("Enter number of sides:");
        sides = Integer.parseInt(scan.nextLine());
        
        int rollResult = diceRoller.nextInt(sides) + 1;
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch");
        }else if (rollResult == sides){
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
