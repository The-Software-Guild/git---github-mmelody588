/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: Game DTO Class for Guess The Number Assignment
 */
package com.mm.guessthenumber.entity;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Game {
    private int id;
    private boolean isFinished;
    private int answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + (this.isFinished ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.answer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.isFinished != other.isFinished) {
            return false;
        }
        if (this.answer != other.answer) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "id=" + id + ", isFinished=" + isFinished + ", answer=" + answer + '}';
    }
    
    
}
