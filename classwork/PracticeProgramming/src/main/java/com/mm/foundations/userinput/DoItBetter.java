/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 3.5 Do It Better
 */
package com.mm.foundations.userinput;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        int miles;
        int hotdogs;
        int languages;
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many miles can you run? ");
        miles = Integer.parseInt(in.nextLine());
        System.out.println("Big deal. I can run " + 2*miles+1 + " miles!");
        
        System.out.println("How many hotdogs can you eat? ");
        hotdogs = Integer.parseInt(in.nextLine());
        System.out.println("Ha! I can eat " + 2*hotdogs+1 + " hotdogs!");
        
        System.out.println("How many languages do you know? ");
        languages = Integer.parseInt(in.nextLine());
        System.out.println("Whatever. I can speak " + 2*languages+1 + "!");
    }
}
