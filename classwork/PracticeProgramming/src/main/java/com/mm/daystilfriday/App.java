/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/23/2021
 * purpose: Application Class for Days until Friday Exercise
 */
package com.mm.daystilfriday;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the day of week: ");
        DaysOfWeek day = DaysOfWeek.valueOf(in.nextLine());
        
        switch(day){
            case MONDAY:
                System.out.println("Four more days until Friday...");
                break;
            case TUESDAY:
                System.out.println("Three more days until Friday...");
                break;
            case WEDNESDAY:
                System.out.println("Two more days until Friday...");
                break;
            case THURSDAY:
                System.out.println("One more day until Friday...");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("Six more days until Friday");
                break;
            case SUNDAY:
                System.out.println("Five more days until Friday...");
                break;
            
        }
    }
}
