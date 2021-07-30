/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/29/2021
 * purpose: User I/O Interface for Book Tracker Project
 */
package com.mm.booktracker.ui;

public interface UserIO {
    void print(String message);

    double readDouble(String prompt);

    double readDouble(String prompt, double min, double max);

    float readFloat(String prompt);

    float readFloat(String prompt, float min, float max);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);

    long readLong(String prompt);

    long readLong(String prompt, long min, long max);

    String readString(String prompt);
}
