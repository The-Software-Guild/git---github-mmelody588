/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/23/2021
 * purpose: User I/O Interface for Address Book Lab
 */
package com.mm.addressbook.ui;

public interface UserIO {
    void print(String message);

    String readString(String prompt);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);

    double readDouble(String prompt);

    double readDouble(String prompt, double min, double max);

    float readFloat(String prompt);

    float readFloat(String prompt, float min, float max);

    long readLong(String prompt);

    long readLong(String prompt, long min, long max);
}
