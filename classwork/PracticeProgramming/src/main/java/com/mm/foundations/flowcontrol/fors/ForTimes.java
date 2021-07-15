/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.3 For Times
 */
package com.mm.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.print("Which time table shall I recite ? ");
        input = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= 15; i++){
            System.out.println(i + " * " + input + " is: " + (i*input));
        }
    }
}
