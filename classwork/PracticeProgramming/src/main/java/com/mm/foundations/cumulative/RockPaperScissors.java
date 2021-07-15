/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Cumulative Exercise 1: Rock, Paper, Scissors
 */
package com.mm.foundations.cumulative;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int numRounds = 0, userThrow = 0, compThrow = 0;
        int userWin = 0, compWin = 0, ties = 0;
        String retry = "";
        do{
            numRounds = 0;
            userThrow = 0;
            compThrow = 0;
            userWin = 0;
            compWin = 0; ties = 0;
            while(true){
                try{
                    System.out.print("Please enter the number of rounds to play: ");
                    numRounds = Integer.parseInt(in.nextLine());
                    break;
                }catch(NumberFormatException nfe){
                    System.out.println("Invalid input. Please try again");
                }
            }
            if(numRounds > 0 && numRounds <= 10){
                System.out.println("Alright! Let's do this!");
                for(int i = 0; i < numRounds; i++){
                    while(true){
                        try{
                            System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors");
                            userThrow = Integer.parseInt(in.nextLine());
                            if(userThrow > 0 && userThrow <= 3){
                                break;
                            } else {
                                System.out.println("Invalid input. Please try again");
                            }
                        }catch(NumberFormatException nfe){
                            System.out.println("Invalid input. Please try again");
                        }
                    }
                    compThrow = rand.nextInt(3)+1;
                
                    System.out.println("Rock, Papers, Scissors, Shoot!");
                    if(userThrow == compThrow){
                        System.out.println("It's a tie!");
                        ties++;
                    }else if(userThrow == 1){
                        if(compThrow == 2){
                            System.out.println("The Computer Wins!");
                            compWin++;
                        }else{
                            System.out.println("The Player Wins!");
                            userWin++;
                        }
                    }else if(userThrow == 2){
                        if(compThrow == 1){
                            System.out.println("The Player Wins!");
                            userWin++;
                        }else{
                            System.out.println("The Computer Wins!");
                            compWin++;
                        }
                    }else if(userThrow == 3){
                        if(compThrow == 1){
                            System.out.println("The Player Wins!");
                            userWin++;
                        }else{
                            System.out.println("The Computer Wins!");
                            compWin++;
                        }
                    }
                }
                System.out.println("The Player won " + userWin + " times");
                System.out.println("The Computer won " + compWin + " times");
                System.out.println("There were " + ties + " ties");
                
                if(userWin > compWin){
                    System.out.println("The player wins!");
                }else if(compWin > userWin){
                    System.out.println("The computer wins!");
                }else {
                    System.out.println("It's a tie!");
                }
                
                System.out.print("Would you like to play again(y/n)?");
                retry = in.nextLine();
            }else{
                System.out.println("Error: Invalid round number. Quitting Program");
                break;
            }
        }while(!retry.equals("n"));
        System.out.println("Thanks for playing!");
    }
}
