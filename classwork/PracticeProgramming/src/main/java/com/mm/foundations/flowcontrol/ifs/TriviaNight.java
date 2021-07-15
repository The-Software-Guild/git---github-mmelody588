/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 4.6 Trivia Night
 */
package com.mm.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args) {
        int correct = 0;
        int answer;
        Scanner in = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println();
        
        System.out.println("FIRST QUESTION");
        System.out.println("What is the capital of the Yukon Territory in Canada?");
        System.out.println("1) Whitehorse               2) Dawson City");
        System.out.println("3) Iqaluit                  4) Saskatoon");
        System.out.println("Please pick a number: ");
        answer = Integer.parseInt(in.nextLine());
        if(answer == 1) {
            correct++;
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect...");
        }
        System.out.println("Current Score: " + correct);
        System.out.println("Three questions left");
        System.out.println();
        
        System.out.println("SECOND QUESTION");
        System.out.println("Which language doesn't come from the Indo-European Family?");
        System.out.println("1) Lombard                  2) Punjabi");
        System.out.println("3) Gaelic                   4) Hungarian");
        System.out.println("Please pick a number: ");
        answer = Integer.parseInt(in.nextLine());
        if(answer == 4) {
            correct++;
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect...");
        }
        System.out.println("Current Score: " + correct);
        System.out.println("Two questions left");
        System.out.println();
        
        System.out.println("THIRD QUESTION QUESTION");
        System.out.println("How many states does Brazil have?");
        System.out.println("1) 5                        2) 26");
        System.out.println("3) 27                       4) 50");
        System.out.println("Please pick a number: ");
        answer = Integer.parseInt(in.nextLine());
        if(answer == 2) {
            correct++;
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect...");
        }
        System.out.println("Current Score: " + correct);
        System.out.println("One question left");
        System.out.println();
        
        System.out.println("FINAL QUESTION");
        System.out.println("At least how many languages are spoken in Nigeria?");
        System.out.println("1) 350                      2) 500");
        System.out.println("3) 525                      4) 450");
        System.out.println("Please pick a number: ");
        answer = Integer.parseInt(in.nextLine());
        if(answer == 3) {
            correct++;
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect...");
        }
        
        System.out.println("Your final score: " + correct);
        switch (correct){
            case 1:
                System.out.println("Better than nothing.");
                break;
            case 2:
                System.out.println("Not bad.");
                break;
            case 3:
                System.out.println("Nice Work!");
                break;
            case 4:
                System.out.println("Perfect Score!");
                break;
            default:
                System.out.println("Better luck next time...");
                break;
        }
    }
}
