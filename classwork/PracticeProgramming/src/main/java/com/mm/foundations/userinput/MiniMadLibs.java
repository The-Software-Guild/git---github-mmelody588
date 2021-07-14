/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 3.8 Mini Mad Libs
 */
package com.mm.foundations.userinput;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1;
        String adj1;
        String noun2;
        int num;
        String adj2;
        String nounPlural1;
        String nounPlural2;
        String noun3;
        String verb;
        String pastVerb;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        System.out.println();
        
        System.out.println("I need a noun: ");
        noun1 = in.nextLine();
        
        System.out.println("Now an adjective: ");
        adj1 = in.nextLine();
        
        System.out.println("Another noun: ");
        noun2 = in.nextLine();
        
        System.out.println("And a number: ");
        num = Integer.parseInt(in.nextLine());
        
        System.out.println("Another Adjective: ");
        adj2 = in.nextLine();
        
        System.out.println("A plural noun: ");
        nounPlural1 = in.nextLine();
        
        System.out.println("Another one: ");
        nounPlural2 = in.nextLine();
        
        System.out.println("One more: ");
        noun3 = in.nextLine();
        
        System.out.println("A verb (infinitive form): ");
        verb = in.nextLine();
        
        System.out.println("Same verb (past participle: ");
        pastVerb = in.nextLine();
        
        System.out.println();
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship " + noun2
        + ". It's " + num + "-year mission: to explore strange " + adj2 + " " + nounPlural1 + ", to seek out "
        + adj2 + " " + nounPlural2 + " and " + adj2 + " " + noun3 + ", to boldly " + verb + " where no one has "
        + pastVerb + " before.");
    }
}
