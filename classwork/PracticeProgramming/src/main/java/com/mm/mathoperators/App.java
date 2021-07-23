/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/23/2021
 * purpose: Application Class for Math Operators Exercise
 */
package com.mm.mathoperators;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op1, op2;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input first operand: ");
        op1 = Integer.parseInt(in.nextLine());
        System.out.print("Input second operand: ");
        op2 = Integer.parseInt(in.nextLine());
        
        int sum = calculate(MathOperators.PLUS, op1, op2);
        int difference = calculate(MathOperators.PLUS, op1, op2);
        int product = calculate(MathOperators.PLUS, op1, op2);
        int quotient = calculate(MathOperators.PLUS, op1, op2);
        
        System.out.println(op1 + " + " + op2 + " = " + sum);
        System.out.println(op1 + " - " + op2 + " = " + difference);
        System.out.println(op1 + " * " + op2 + " = " + product);
        System.out.println(op1 + " / " + op2 + " = " + quotient);
    }
    
    public static int calculate(MathOperators operator, int operand1, int operand2){
        switch(operator) {
                case PLUS:
                      return operand1 + operand2;
                case MINUS:
                      return operand1 - operand2;
                case MULTIPLY:
                      return operand1 * operand2;
                case DIVIDE:
                      return operand1 / operand2;
                default:
                      throw new UnsupportedOperationException();
         }
    }
}