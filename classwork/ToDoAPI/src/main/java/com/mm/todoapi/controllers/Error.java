/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/09/2021
 * purpose: Error Class for REST Exercise
 */
package com.mm.todoapi.controllers;

import java.time.LocalDateTime;

public class Error {
    private LocalDateTime timestamp = LocalDateTime.now();
    private String message;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
