/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/20/2021
 * purpose: Factorizer Class for refactoring lab
 */
package com.mm.factorizer;

import java.util.Scanner;

public class Factorizer {
    public void factorize(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int factors = 0;
        int num;
        
        System.out.print("What number would you like to factor? ");
        num = Integer.parseInt(in.nextLine());
        System.out.println("The factors of " + num + " are:");
        for(int i = 1; i < num; i++){
            if((num%i) == 0){
                System.out.print(i + " ");
                sum += i;
                factors++;
            }
        }
        System.out.println();
        System.out.println(num + " has " + factors + " factors.");
        if(sum == num){
            System.out.println(num + " is a perfect number.");
        }else {
            System.out.println(num + " is not a perfect number.");
        }
        
        if(factors == 1){
            System.out.println(num + " is a prime number.");
        } else{
            System.out.println(num + " is not a prime number.");
        }
    }
}
