/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.windowmaster;

import java.util.Scanner;

/**
 *
 * @author mmelo
 */
public class WindowMaster {
    public static void main(String[] args){
        // variables for window height, width, glass cost, trimming cost, and number of windows
        float height = 0;
        float width = 0;
        float window = 0;
        float trim = 0;
        int number = 0;
    
        // holders for user inputs of above values
        String inHeight = "";
        String inWidth = "";
        String inWindow = "";
        String inTrim = "";
        String inNumber = "";
    
        // other variables including area, perimeter, and price
        float windowArea;
        float windowPerimeter;
        float price;
        boolean isValid = false;
    
        // scanner to process user inputs
        Scanner scan = new Scanner(System.in);
        do{
            try{
                // input window height and convert to float
                System.out.println("Please enter window height:");
                inHeight = scan.nextLine();
                height = Float.parseFloat(inHeight);
        
                // input window width and convert to float
                System.out.println("Please enter window width:");
                inWidth = scan.nextLine();
                width = Float.parseFloat(inWidth);
        
                // input window glass price and convert to float
                System.out.println("Please enter window trim price:");
                inWindow = scan.nextLine();
                window = Float.parseFloat(inWindow);
        
                // input window trim price and convert to float
                System.out.println("Please enter window trim price:");
                inTrim = scan.nextLine();
                trim = Float.parseFloat(inTrim);
        
                // input number of windows and convert to int (no half windows)
                System.out.println("Please enter number of windows:");
                inNumber = scan.nextLine();
                number = Integer.parseInt(inNumber);
        
                isValid = true;
            }catch(NumberFormatException nfe){
                System.out.println("Invalid input detected.");
            }
        }while(!isValid);
        
        // calculate window area, perimeter, and total price
        windowArea = height*width;
        windowPerimeter = 2*(height+width);
        price = number*(window*windowArea + trim*windowPerimeter);
        
        // output values
        System.out.println("Window height = " + inHeight);
        System.out.println("Window width = " + inWidth);
        System.out.println("Window glass price = " + inWindow);
        System.out.println("Window trim price = " + inTrim);
        System.out.println("Window number = " + inNumber);
        System.out.println("Window area = " + windowArea);
        System.out.println("Window perimeter = " + windowPerimeter);
        System.out.println("Total Cost =  " + price);
    }
}
