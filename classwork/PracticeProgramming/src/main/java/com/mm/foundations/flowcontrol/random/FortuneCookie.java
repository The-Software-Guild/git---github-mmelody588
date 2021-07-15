/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 5.3 Fortune Cookie
 */
package com.mm.foundations.flowcontrol.random;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random rand = new Random();
        int fortune = rand.nextInt(10);
    
        System.out.print("Your Geek fortune: ");
        
        switch (fortune) {
            case 0:
                System.out.println("I ain't got time to bleed");
                break;
            case 1:
                System.out.println("Monkey Fighting Snakes on this Monday to Friday Plane");
                break;
            case 2:
                System.out.println("Candygram for Mungo!");
                break;
            case 3:
                System.out.println("We're men! We're men in tights!");
                break;
            case 4:
                System.out.println("We found a witch! May we burn her?");
                break;
            case 5:
                System.out.println("I am serious. And don't call me Shirley.");
                break;
            case 6:
                System.out.println("Kali Ma!");
                break;
            case 7:
                System.out.println("Yo! Soy Jacinto El Grande");
                break;
            case 8:
                System.out.println("Spare a peso for your fellow American?");
                break;
            case 9:
                System.out.println("It appears we've been jammed...rasberry!");
                break;
        }
    }
}
