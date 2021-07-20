/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/19/2021
 * purpose: Student Quiz Score Exercise
 */
package com.mm.foundations.collectionsandio;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentQuizGrades {
    HashMap<String, ArrayList<Integer>> grades = new HashMap<String, ArrayList<Integer>>();
    UserIOImpl user = new UserIOImpl();
    
    public void View(){
        System.out.println("All students in the system:");
        for(String i : grades.keySet()){
            //System.out.println("Student Name: ");
            System.out.println(i);
           // System.out.println("List of quiz scores:");
            //System.out.println(grades.get(i));
        }
    }
    
    public void addStudent(){
        String name = user.readString("Enter Student name: ");
        int x;
        ArrayList<Integer> scores = new ArrayList<Integer>();
        do{
            x = user.readInt("Enter grade score or negative number to exit: ");
            if(x >= 0){
                scores.add(x);
            }else{
                break;
            }
        }while(true);
        grades.put(name, scores);
    }
    
    public void removeStudent(){
        String name = user.readString("Enter name of student to delete: ");
        grades.remove(name);
    }
    
    public void getScores(){
        String name = user.readString("Enter name of student whose grades you wish to see: ");
        System.out.println(name + "'s grades:");
        System.out.println(grades.get(name));
    }
    
    public void getAverage(){
        String name = user.readString("Enter name of student whose grade average you wish to view: ");
        int sum = 0;
        int elements = grades.get(name).size();
        for(int i = 0; i < elements; i++){
            sum += grades.get(name).get(i);
        }
        
        int avg = sum / elements;
        System.out.println("The average quiz score for " + name + " is " + avg);
    }
    
    public void getClassAverage(){
        int sum = 0;
        int elements = 0;
        int j, avg;
        for(String i : grades.keySet()){
            elements += grades.get(i).size();
            for(j = 0; j < grades.get(i).size(); j++){
                sum += grades.get(i).get(j);
            }
        }
        avg = sum/elements;
        System.out.println("The average quiz score for the class is " + avg);
    }
    
    public void getHighestScore(){
        int max = -1;
        String name = "";
        for(String i : grades.keySet()){
            for(int j = 0; j < grades.get(i).size(); j++){
                if(max < grades.get(i).get(j)){
                    name = i;
                    max = grades.get(i).get(j);
                }
            }
        }
        System.out.println(name + " has the highest quiz score of " + max);
    }
    
    public void getLowestScore(){
        int min = 100;
        String name = "";
        for(String i : grades.keySet()){
            for(int j = 0; j < grades.get(i).size(); j++){
                if(min > grades.get(i).get(j)){
                    name = i;
                    min = grades.get(i).get(j);
                }
            }
        }
        System.out.println(name + " has the lowest quiz score of " + min);
    }
}
