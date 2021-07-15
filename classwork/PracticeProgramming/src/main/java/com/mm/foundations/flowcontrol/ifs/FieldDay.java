/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 4.9 Field Day
 */
package com.mm.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {
        String lastName;
        Scanner in = new Scanner(System.in);
    
        System.out.println("What is your last name? ");
        lastName = in.nextLine();
        
        if(lastName.compareTo("Baggins") <= 0){
            System.out.println("Aha! You're on the team \"Red Dragons\"!");
        }else if(lastName.compareTo("Baggins") > 0 && lastName.compareTo("Dresden") <= 0){
            System.out.println("Aha! You're on the team \"Dark Wizards\"!");
        }else if(lastName.compareTo("Dresden") > 0 && lastName.compareTo("Howl") <= 0){
            System.out.println("Aha! You're on the team \"Moving Castles\"!");
        }else if(lastName.compareTo("Howl") > 0 && lastName.compareTo("Potter") <= 0){
            System.out.println("Aha! You're on the team \"Golden Snitches\"!");
        }else if(lastName.compareTo("Potter") > 0 && lastName.compareTo("Vimes") <= 0){
            System.out.println("Aha! You're on the team \"Night Guards\"!");
        }else{
            System.out.println("Aha! You're on the team \"Black Holes\"!");
        }
        
        System.out.println("Good luck in the games!");
    }
}
