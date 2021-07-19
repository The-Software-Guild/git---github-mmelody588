/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.classmodeling;

public class GroceryStoreIceCream {
    private String brand;
    private double price;
    private int stock;
    private String flavor;
    private int aisle;

    public GroceryStoreIceCream() {
        this.brand = "Breyers";
        this.price = 4.99;
        this.stock = 50;
        this.flavor = "Mint Chocolate Chip";
        this.aisle = 11;
    }

    public GroceryStoreIceCream(String brand, double price, int stock, String flavor, int aisle) {
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.flavor = flavor;
        this.aisle = aisle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }
}
