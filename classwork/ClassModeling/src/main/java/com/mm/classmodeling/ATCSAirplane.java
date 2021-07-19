/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.classmodeling;

public class ATCSAirplane {
    private int flightNumber;
    private String airline;
    private String departingFrom;
    private String arrivingAt;
    private double departureTime;
    private double arrivalTime;
    private boolean departed;
    private double flightTime;

    public ATCSAirplane() {
        this.flightNumber = 500;
        this.airline = "American Airlines";
        this.departingFrom = "ORD";
        this.arrivingAt = "LHR";
        this.departureTime = 13.45;
        this.arrivalTime = 6.55;
        this.departed = true;
        this.flightTime = 3.36;
    }

    public ATCSAirplane(int flightNumber, String airline, String departingFrom, String arrivingAt, double departureTime, double arrivalTime, boolean departed, double flightTime) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departingFrom = departingFrom;
        this.arrivingAt = arrivingAt;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departed = departed;
        this.flightTime = flightTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartingFrom() {
        return departingFrom;
    }

    public void setDepartingFrom(String departingFrom) {
        this.departingFrom = departingFrom;
    }

    public String getArrivingAt() {
        return arrivingAt;
    }

    public void setArrivingAt(String arrivingAt) {
        this.arrivingAt = arrivingAt;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isDeparted() {
        return departed;
    }

    public void setDeparted(boolean departed) {
        this.departed = departed;
    }

    public double getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(double flightTime) {
        this.flightTime = flightTime;
    }
}
