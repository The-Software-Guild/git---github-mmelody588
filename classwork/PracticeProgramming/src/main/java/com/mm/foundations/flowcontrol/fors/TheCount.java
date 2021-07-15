/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.5 The Count
 */
package com.mm.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TheCount {
    public static void main(String[] args) {
        int start, stop, countBy;
        int num = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
        System.out.print("Start at : ");
        start = Integer.parseInt(in.nextLine());
        
        System.out.print(" Stop at : ");
        stop = Integer.parseInt(in.nextLine());
        
        System.out.print("Count by : ");
        countBy = Integer.parseInt(in.nextLine());
        
        for(int i = start; i <= stop; i += countBy){
            System.out.print(i + " ");
            num++;
            if(num == 3){
                System.out.println(" - Ah ah ah!");
            }
        }
    }
}
