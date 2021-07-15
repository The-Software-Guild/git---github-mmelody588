/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 4.10 Mini Zork
 */
package com.mm.foundations.flowcontrol.ifs;

//NOT FINISHED
import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("To the north is a dilapidated barn.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, go to the barn, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { 
                System.out.println("You Stick your hand inside the mailbox.");
                System.out.println("You fell something metallic in your hand.");
                System.out.println("Take it, or search for more?");
                action = userInput.nextLine();
                
                if (action.equals("take it")){
                    System.out.println("It's a penny! What luck!");
                    System.out.println("You decide that's your limit for luck today and leave");
                } else if (action.equals("search for more")){
                    System.out.println("Something grabs you and pulls you in.");
                    System.out.println("You are never heard from again.");
                }
           }
        } else if (action.equals("go to the house")) { 
        
        } else if (action.equals("go to the barn")){
            
        }
    }
}
