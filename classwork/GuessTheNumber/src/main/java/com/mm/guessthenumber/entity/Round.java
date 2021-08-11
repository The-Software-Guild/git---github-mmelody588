/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: Round DTO Class for Guess The Number Assignment
 */
package com.mm.guessthenumber.entity;

import java.sql.Timestamp;

public class Round {
    private int roundId;
    private Timestamp time;
    String result;
    private int gameId;

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
}
