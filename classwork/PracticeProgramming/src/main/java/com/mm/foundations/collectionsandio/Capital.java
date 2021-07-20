/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/20/2021
 * purpose: 3rd State Capitals exercise; Capital class
 */
package com.mm.foundations.collectionsandio;

public class Capital {
    private String name;
    private int population;
    private double squareMileage;
    private String stateName;

    public Capital(String stateName) {
        this.stateName = stateName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquareMileage() {
        return squareMileage;
    }

    public void setSquareMileage(double squareMileage) {
        this.squareMileage = squareMileage;
    }
    
    public String getStateName(){
        return stateName;
    }
}
