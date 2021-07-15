/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Module Exercise 2: Interest Calculator
 */
package com.mm.foundations.exercises;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double currentBalance, interestRate, updatedBalance;
        int divisor = 1;
        int i, j, numYears, method;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How much do you want to invest? ");
        currentBalance = Double.parseDouble(in.nextLine());
        
        System.out.print("How many years are investing? ");
        numYears = Integer.parseInt(in.nextLine());
        
        System.out.print("What is the annual interest rate % growth? ");
        interestRate = Double.parseDouble(in.nextLine());
        
        System.out.println("How would you like interest compounded");
        System.out.println("1) Quarterly   2) Monthly   3) Daily");
        method = Integer.parseInt(in.nextLine());
        if(method == 1){
            divisor = 4;
        }else if(method == 2){
            divisor = 12;
        }else {
            divisor = 365;
        }
        
        interestRate /= divisor;
        System.out.println();
        
        for(i = 1; i <= numYears; i++){
            updatedBalance = currentBalance;
            for(j = 0; j < divisor; j++){
                updatedBalance *= (1+(interestRate/100));
            }
            
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + currentBalance);
            System.out.println("Earned $" + (updatedBalance -currentBalance));
            System.out.println("Ended with $" + updatedBalance);
            System.out.println();
            currentBalance = updatedBalance;
        }
        
    }
}
