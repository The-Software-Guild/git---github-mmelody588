/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 9.1 A Rainbow
 */
package com.mm.foundations.basics.arrays;

public class ARainbow {
    public static void main(String[] args) {
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

        /*
        System.out.println(colors[5]);
        System.out.println(colors[3]);
        System.out.println(colors[2]);
        System.out.println(colors[1]);
        System.out.println(colors[4]);
        System.out.println(colors[0]);
        System.out.println(colors[6]);
        */
        
        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

    }
}
