/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 6.8 Beware The Kraken
 */
package com.mm.foundations.flowcontrol.whiles;

import java.util.Scanner;
import java.util.Random;

public class BewareTheKraken {
    public static void main(String[] args) {

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        String surface;
        int fishType;
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            fishType = rand.nextInt(4);
            switch (fishType){
                case 0:
                    System.out.println("I can see a dolphin!");
                    break;
                case 1:
                    System.out.println("I can see a pufferfish!");
                    break;
                case 2:
                    System.out.println("I can see a stingray!");
                    break;
                case 3:
                    System.out.println("I can see a shark!");
                    break;
            }

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            System.out.print("Shall we head back to the surface(y/n)? ");
            surface = scan.nextLine();
            if(surface.equals("y")){
                System.out.println("Heading up...");
                break;
            }else{
                System.out.println("Continuing down...");
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        /*
        If we change the while condition to simply "true", there will be no real changes
        The loop will automatically break when depthDivedInFt reaches 20000
        */
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
