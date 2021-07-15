/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Module Exercise 3: Lucky Sevens
 */
package com.mm.foundations.exercises;

import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main(String[] args) {
        int die1, die2, rollCount = 0;
        int money, maxMoney, maxRoll = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("How many dollars do you have? ");
        money = Integer.parseInt(in.nextLine());
        maxMoney = money;
        
        while(money > 0){
            rollCount++;
            die1 = rand.nextInt(6)+1;
            die2 = rand.nextInt(6)+1;
            
            if((die1+die2) == 7){
                money += 4;
            } else {
                money--;
            }
            
            if(money > maxMoney){
                maxMoney = money;
                maxRoll = rollCount;
            }
        }
        
        System.out.println("You are broke after " + rollCount + " rolls.");
        System.out.println("You should have quit after " + maxRoll + " rolls when you had $" + maxMoney);
    }
}
