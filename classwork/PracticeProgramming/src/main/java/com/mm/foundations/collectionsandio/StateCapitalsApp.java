/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/20/2021
 * purpose: 3rd State Capitals Exercise; App class
 */
package com.mm.foundations.collectionsandio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitalsApp {
    
    public static final String FILE_NAME = "MoreStateCapitals.txt";
    public static final String DELIMITER = "::";
    
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Capital> map = new HashMap<String, Capital>();
        Scanner scanner = new Scanner(
                new BufferedReader(
                        new FileReader(FILE_NAME)));;
        Scanner in = new Scanner(System.in);
        
        String currentLine;
        int count = 0;
        Capital currentCap;
        while(scanner.hasNextLine()){
            currentLine = scanner.nextLine();
            currentCap = unmarshallCapital(currentLine);
            map.put(currentCap.getStateName(), currentCap);
            count++;
        }
        scanner.close();
        
        System.out.println(count + " STATE/CAPITAL PAIRS LOADED.");
        System.out.println("==============================");
        for(String i : map.keySet()) {
            System.out.println(i + " - " + map.get(i).getName() + " | Pop: " 
                    + map.get(i).getPopulation() + " | Area: " 
                    + map.get(i).getSquareMileage() + " sq mi");
        }
        int pop = 0;
        double square = 0.0;
        try{
            System.out.print("Please enter the lower limit for capital city population: ");
            pop = Integer.parseInt(in.nextLine());
        }catch(NumberFormatException nfe){
            System.out.println("Error: Invalid input");
        }
        
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + pop + ":");
        for(String i : map.keySet()){
            if(map.get(i).getPopulation() >= pop){
                System.out.println(i + " - " + map.get(i).getName() + " | Pop: " 
                    + map.get(i).getPopulation() + " | Area: " 
                    + map.get(i).getSquareMileage() + " sq mi");
            }
        }
        
        try{
            System.out.print("Please enter the upper limit for capital city sq mileage: ");
            square = Double.parseDouble(in.nextLine());
        }catch(NumberFormatException nfe){
            System.out.println("Error: Invalid input");
        }
        
        System.out.println("LISTING CAPITALS WITH SQ MILEAGES LESS THAN " + square + ":");
        for(String i : map.keySet()){
            if(map.get(i).getSquareMileage() <= square){
                System.out.println(i + " - " + map.get(i).getName() + " | Pop: " 
                    + map.get(i).getPopulation() + " | Area: " 
                    + map.get(i).getSquareMileage() + " sq mi");
            }
        }
    }
    
    public static Capital unmarshallCapital(String capitalAsText){
        String[] capitalTokens = capitalAsText.split(DELIMITER);
        
        String stateName = capitalTokens[0];
        int pop = Integer.parseInt(capitalTokens[2]);
        double square = Double.parseDouble(capitalTokens[3]);
        
        Capital cap = new Capital(stateName);
        cap.setName(capitalTokens[1]);
        cap.setPopulation(pop);
        cap.setSquareMileage(square);
        
        return cap;
    }
}
