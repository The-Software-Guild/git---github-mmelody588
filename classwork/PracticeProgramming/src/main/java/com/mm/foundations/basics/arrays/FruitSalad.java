/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 9.5 Fruit Salad
 */
package com.mm.foundations.basics.arrays;

import java.util.ArrayList;
import java.util.Random;

public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;

        // Code Recipe for fruit salad should go here!
        fruitSalad = new String[12];
        Random rand = new Random();
        ArrayList<String> berries = new ArrayList<String>();
        ArrayList<String> apples = new ArrayList<String>();
        ArrayList<String> oranges = new ArrayList<String>();
        ArrayList<String> other = new ArrayList<String>();
        int i, length, ind;
        
        for(i = 0; i < fruit.length; i++){
            if(fruit[i].contains("berry")){
                berries.add(fruit[i]);
            } else if(fruit[i].contains("Apple")){
                apples.add(fruit[i]);
            } else if(fruit[i].contains("Orange")){
                oranges.add(fruit[i]);
            } else if(fruit[i].contains("Tomato")){
                continue;
            } else {
                other.add(fruit[i]);
            }
        }
        length = 0;
        
        for(i = 0; i < berries.size(); i++){
            fruitSalad[length] = berries.get(i);
            length++;
        }
        for(i = 0; i < 3; i++){
            ind = rand.nextInt(apples.size());
            fruitSalad[length] = apples.get(ind);
            apples.remove(ind);
            length++;
        }
        for(i = 0; i < 2; i++){
            ind = rand.nextInt(oranges.size());
            fruitSalad[length] = oranges.get(ind);
            oranges.remove(ind);
            length++;
        }
        int bound = fruitSalad.length-length;
        for(i = 0; i < bound; i++){
            ind = rand.nextInt(other.size());
            fruitSalad[length] = other.get(ind);
            other.remove(ind);
            length++;
        }
        
        for(i = 0; i < fruitSalad.length; i++){
            System.out.print(fruitSalad[i] + " ");
        }
        System.out.println();
    }
}
