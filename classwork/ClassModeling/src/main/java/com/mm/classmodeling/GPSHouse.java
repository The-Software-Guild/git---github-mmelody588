/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.classmodeling;

public class GPSHouse {
    private double latitude;
    private double longitude;
    private String address;
    private String cityName;
    private String state;
    private int zipcode;

    public GPSHouse() {
        this.latitude = 76.538;
        this.longitude = 102.985;
        this.address = "103 Navajo Street";
        this.cityName = "Pine Grove";
        this.state = "Montana";
        this.zipcode = 90146;
    }

    public GPSHouse(double latitude, double longitude, String address, String cityName, String state, int zipcode) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.cityName = cityName;
        this.state = state;
        this.zipcode = zipcode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
