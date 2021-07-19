/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/16/2021
 * purpose: Abstract class for Shapes and Perimeters Classes Exercise
 */
package com.mm.shapesandperimeters;

public abstract class Shape {
    protected String color;
    
    abstract int getArea();
    abstract int getPerimeter();
}
