/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 3.3 Passing The Turing Test
 */
package com.mm.foundations.userinput;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {    
        String userName;
        String compName = "Albert";

        String userColor;
        String compColor = "Beige";
    
        String userFruit;
        String compFruit = "pineapples";
    
        int userNum;
        int compNum = 255;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.println("What is your name? ");
        userName = in.nextLine();
        System.out.println();
        System.out.println("Hi, " + userName + "! I'm " + compName + ".");
        System.out.println("What's your favorite color? ");
        userColor = in.nextLine();
        System.out.println();
        System.out.println("Huh, " + userColor + "? Mine's " + compColor);
        System.out.println();
        System.out.println("I really like " + compFruit + ". They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + userName + "? ");
        userFruit = in.nextLine();
        System.out.println();
        System.out.println("Really? " + userFruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number? ");
        userNum = Integer.parseInt(in.nextLine());
        System.out.println();
        System.out.println(userNum + " is a cool number. Mine's " + compNum);
        System.out.println("Did you know " + userNum + " * " + compNum + " is " + (userNum*compNum)
        + "? That's a cool number too!");
        System.out.println();
        System.out.println("Well, thanks for talking to me, " + userName + "!");
    }
}
