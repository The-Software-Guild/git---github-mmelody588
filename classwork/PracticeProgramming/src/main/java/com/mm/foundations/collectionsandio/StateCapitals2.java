/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/19/2021
 * purpose: Collections Exercise State Capitals 2
 */
package com.mm.foundations.collectionsandio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StateCapitals2{
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> states = new HashMap<String, String>();
        Scanner in = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        int count = 0;
        Scanner user = new Scanner(System.in);
        String[] place = new String[2];
        String currentLine;
        while(in.hasNextLine()){
            currentLine = in.nextLine();
            place = currentLine.split("::");
            states.put(place[0], place[1]);
            count++;
        }
        System.out.println(count + " STATES AND CAPITALS ARE LOADED.");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES : ");
        for(String i : states.keySet()){
            System.out.print(i + ", ");
        }
        System.out.println();
        
        List<String> keys = new ArrayList<String>(states.keySet());
        Random r = new Random();
        
        int x = r.nextInt(keys.size());
        String state = keys.get(x);
        String capital = "";
        
        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '" + state + "'?");
        capital = user.nextLine();
        if(capital.equals(states.get(state))){
            System.out.println("NICE WORK! " + capital + " IS CORRECT!");
        }else {
            System.out.println("WRONG! THE CORRECT ANSWER IS " + states.get(state));
        }
    }
}
