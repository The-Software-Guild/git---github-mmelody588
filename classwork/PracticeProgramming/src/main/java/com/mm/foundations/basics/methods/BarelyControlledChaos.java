/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 8.4 Barely Controlled Chaos
 */
package com.mm.foundations.basics.methods;

import java.util.Random;

public class BarelyControlledChaos {
    
    static Random rand = new Random();
    
    public static void main(String[] args) {

        String color = getColor(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColor(); // call color method again here
        int weight = getNumber(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = getNumber(10, 20); // call number method,
            // with a range between 10 - 20
        int number = getNumber(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = getNumber(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    static String getColor(){
        int color = rand.nextInt(6);
        String colour = "";
        switch(color){
            case 0:
                colour = "blue";
                break;
            case 1:
                colour = "red";
                break;
            case 2:
                colour = "yellow";
                break;
            case 3:
                colour = "green";
                break;
            case 4:
                colour = "orange";
                break;
            case 5:
                colour = "purple";
                break;
        }
        return colour;
    }
    
    static String getAnimal(){
        int random = rand.nextInt(6);
        String animal = "";
        switch(random){
            case 0:
                animal = "elephant";
                break;
            case 1:
                animal = "gopher";
                break;
            case 2:
                animal = "dog";
                break;
            case 3:
                animal = "cow";
                break;
            case 4:
                animal = "squirrel";
                break;
            case 5:
                animal = "whale";
                break;
        }
        return animal;
    }
    
    static int getNumber(int min, int max){
        return rand.nextInt(max-min) + min;
    }
}
