/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/14/2021
 * purpose: Exercise 2.5 Menu of Champions
 */
package com.mm.foundations.variables;

public class MenuOfChampions {
    public static void main(String[] args) {
        double price1 = 15.95;
        double price2 = 48.95;
        double price3 = 6.95;
        
        String food1 = "Shrimp Cocktail";
        String food2 = "Filet Mignon";
        String food3 = "Creamed Spinach";
        
        System.out.println(" _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _");
        System.out.println("(_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_)");
        System.out.println();
        System.out.println("        Welcome to Wildfire Steakhouse!");
        System.out.println("        Today's Menu Is...");
        System.out.println();
        System.out.println(" _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _");
        System.out.println("(_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_)");
        System.out.println();
        System.out.println("        $" + price1 +"***" + food1);
        System.out.println("        $" + price2 +"***" + food2);
        System.out.println("        $" + price3 +"***" + food3);
    }
}
