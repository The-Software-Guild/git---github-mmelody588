/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.4 For Times For
 */
package com.mm.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input, answer;
        int points = 0;
        System.out.print("Which time table shall I recite ? ");
        input = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= 15; i++){
            System.out.print(i + " * " + input + " is: ");
            answer = Integer.parseInt(in.nextLine());
            if(answer == (input*i)){
                System.out.println("Correct!");
                points++;
            } else {
                System.out.println("Sorry no, the answer is: " + (i*input));
            }
        }
        System.out.println("You got " + points + " correct.");
        if(points >= 13){
            System.out.println("Way to go!");
        } else if(points <= 7){
            System.out.println("Maybe you should go back to studying...");
        }
    }
}
