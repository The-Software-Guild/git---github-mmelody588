/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/16/2021
 * purpose: Rectangle class for Shapes and Perimeters Classes Exercise
 */
package com.mm.shapesandperimeters;

public class Rectangle extends Shape {
    private int area;
    private int perimeter;
    
    
    @Override
    public int getArea(){
        return area;
    }
    
    @Override
    public int getPerimeter(){
        return perimeter;
    }
}
