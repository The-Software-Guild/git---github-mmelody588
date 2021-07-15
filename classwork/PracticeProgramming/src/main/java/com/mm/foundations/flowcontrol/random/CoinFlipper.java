/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Java Exercise 5.5 Coin Flipper
 */
package com.mm.foundations.flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        Random coin = new Random();
        boolean flip;
        
        System.out.println("Ready, Set, Flip...!");
        flip = coin.nextBoolean();
        
        if(flip == true){
            System.out.println("You got HEADS!");
        }else{
            System.out.println("You Got TAILS!");
        }
    }
           
}
