/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 3.6 Bigger Better Adder
 */
package com.mm.foundations.userinput;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {
        
        int x, y, z, sum;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Please enter the first number: ");
        x = Integer.parseInt(in.nextLine());
        
        System.out.println("Please enter the second number: ");
        y = Integer.parseInt(in.nextLine());
        
        System.out.println("Please enter the thirdnumber: ");
        z = Integer.parseInt(in.nextLine());
        
        sum = x+y+z;
        System.out.println(x + "+" + y + "+" + z + "=" + sum);
    }
}
