/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.classmodeling;

public class VideoGameCar {
    
    private String carName;
    private int topSpeed;
    private int acceleration;
    private int handling;
    private int durability;
    private boolean unlocked;

    public VideoGameCar() {
        this.carName = "Crusero";
        this.topSpeed = 45;
        this.acceleration = 60;
        this.handling = 55;
        this.durability = 80;
        this.unlocked = true;
    }

    public VideoGameCar(String carName, int topSpeed, int acceleration, int handling, int durability, boolean unlocked) {
        this.carName = carName;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.handling = handling;
        this.durability = durability;
        this.unlocked = unlocked;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }
    
    
}
