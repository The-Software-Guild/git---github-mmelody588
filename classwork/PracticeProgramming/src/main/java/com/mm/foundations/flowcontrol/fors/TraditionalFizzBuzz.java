/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.9 Traditional Fizz Buzz
 */
package com.mm.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int count = 0;
        
        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        num = Integer.parseInt(in.nextLine());
        for(int i = 0; i < num*3; i++){
            if(i > 0 &&(i%3) == 0 && (i%5) == 0){
                System.out.println("fizz buzz");
                count++;
            } else if(i > 0 && (i%3) == 0){
                System.out.println("fizz");
                count++;
            } else if(i > 0 &&(i%5) == 0){
                System.out.println("buzz");
                count++;
            }else {
                System.out.println(i);
            }
            if(count == num){
                break;
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
