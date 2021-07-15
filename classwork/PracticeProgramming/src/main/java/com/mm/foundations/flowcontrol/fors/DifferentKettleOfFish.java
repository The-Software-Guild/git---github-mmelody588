/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 7.7 Different Kettle of Fish
 */
package com.mm.foundations.flowcontrol.fors;


public class DifferentKettleOfFish {
    public static void main(String[] args) {

        /*int fish = 1;
        while(fish < 10){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }

            fish++;
        }*/
        
        //The initialization and increment lines for fish were merged with the condition
        for(int fish = 1; fish < 10; fish++){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }
        }

    }
}
