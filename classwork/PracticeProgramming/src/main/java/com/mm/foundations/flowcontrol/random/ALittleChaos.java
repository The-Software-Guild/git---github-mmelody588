/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 5.1 A Little Chaos
 */
package com.mm.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        // greater ranges than int
        System.out.println("Long: " + randomizer.nextLong());
        // lower precision than double
        System.out.println("Float: " + randomizer.nextFloat());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        // random numbers can be used in a math statement as seen here
        int sum = (randomizer.nextInt() + randomizer.nextInt());
        System.out.println(sum);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        //When randomizer.Next(101) is changed to randomizer.Next(51) + 50,
        // It returns a value between 50 and 100 instead of 0 and 100.
        // Specifically, it generates an int between 0 and 50 and adds 50.
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(51)+50 + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
    }
}
