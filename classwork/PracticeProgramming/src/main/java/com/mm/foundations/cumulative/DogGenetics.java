/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Cumulative Exercise 2: Dog Genetics
 */
package com.mm.foundations.cumulative;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        String name;
        String[] breeds = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur"," King Doberman"};
        int total = 100;
        int percentage;
        
        System.out.print("What is your dog's name? ");
        name = in.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + name +
                "'s prestigious background right here.");
        System.out.println(name + " is:");
        
        for(int i = 0; i < 5; i++){
            if(i != 4){
                percentage = rand.nextInt(total)+1;
                total -= percentage;
                System.out.println(percentage + "% " + breeds[i]);
            }else{
                System.out.println(total + "% " + breeds[i]);
            }
        }
        
        System.out.println("Wow, that's QUITE the dog!");
    }
}
