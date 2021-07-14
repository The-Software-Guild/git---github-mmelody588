/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 2.3 The Order Of Things
 */
package com.mm.foundations.variables;

public class TheOrderOfThings {
    public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // The " " characters add spaces to the sentence
        // You can also do this by including spaces in the strings e.g. "dragons "
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        
        System.out.println(noun + " " + purpose + " " + material + " " + origin + " " + color + " "
                 + shape + " " + age + " " + size + " " + opinion + " " + number);
    }
}
