/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/15/2021
 * purpose: Java Exercise 9.3 Fruits Basket
 */
package com.mm.foundations.basics.arrays;

public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        // Fruit counting code goes here!
        for(int i = 0; i < fruitBasket.length; i++){
            if(fruitBasket[i].equals("Apple")){
                numApples++;
            } else if(fruitBasket[i].equals("Orange")){
                numOranges++;
            }else{
                numOtherFruit++;
            }
        }

        // Print The Results!
        System.out.println("Total# of Fruit in Basket: " + fruitBasket.length);
        System.out.println("Number of Apples: " + numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of Other Fruit: " + numOtherFruit);
    }
}
