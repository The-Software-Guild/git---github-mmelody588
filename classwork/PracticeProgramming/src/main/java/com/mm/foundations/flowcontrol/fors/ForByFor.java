/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.8 For By For
 */
package com.mm.foundations.flowcontrol.fors;

public class ForByFor {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    //System.out.print("*");
                    if(j == 1){
                        if(i == 0 || i == 2){
                            System.out.print("$");
                        } else {
                            System.out.print("#");
                        }
                    } else if (i == 1){
                        System.out.print("@");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
