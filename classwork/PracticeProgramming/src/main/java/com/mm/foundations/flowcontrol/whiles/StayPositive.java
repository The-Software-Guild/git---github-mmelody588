/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Exercise 6.2 Stay Positive
 */
package com.mm.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {
        int count = 10;
        int line = 0;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number to count down from: ");
            count = Integer.parseInt(scan.nextLine());
            if(count > 0){
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
        System.out.println("Counting Down...");
        while(count >= 0){
            System.out.print(count-- + " ");
            line++;
            if(line == 10){
                System.out.println();
                line = 0;
            }
        }
        System.out.println();
        System.out.println("Blast Off!");
    }
}
