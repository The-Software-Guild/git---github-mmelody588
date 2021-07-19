/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.classmodeling;

public class LibraryBook {
    private String author;
    private int yearPublished;
    private boolean isFiction;
    private String section;
    private int callNumber;
    private int copiesAvailable;

    public LibraryBook(){
        this.author = "John Doe";
        this.yearPublished = 2000;
        this.isFiction = true;
        this.section = "Mystery";
        this.callNumber = 4945;
        this.copiesAvailable = 2;
    }
    
    public LibraryBook(String author, int yearPublished, boolean isFiction, String section, int callNumber, int copiesAvailable) {
        this.author = author;
        this.yearPublished = yearPublished;
        this.isFiction = isFiction;
        this.section = section;
        this.callNumber = callNumber;
        this.copiesAvailable = copiesAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isIsFiction() {
        return isFiction;
    }

    public void setIsFiction(boolean isFiction) {
        this.isFiction = isFiction;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }
}