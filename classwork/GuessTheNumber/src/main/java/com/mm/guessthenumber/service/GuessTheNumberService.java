/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: Service Class for Guess The Number Assignment
 */
package com.mm.guessthenumber.service;

import com.mm.guessthenumber.dao.GuessTheNumberDao;
import com.mm.guessthenumber.entity.Game;
import com.mm.guessthenumber.entity.Round;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GuessTheNumberService {
    @Autowired
    GuessTheNumberDao dao;
    
    public Game addGame(Game game){
        return dao.addGame(game);
    }
    
    public Round addRound(Round round){
        return dao.addRound(round);
    }
    
    public List<Game> getAllGames(){
        List<Game> result = dao.getAllGames();
        for(Game g : result){
            if(g.getIsFinished() == false){
                g.setAnswer(0);
            }
        }
        return result;
    }
    
    public Game getGame(int id){
        Game g = dao.findGameById(id);
        if(g == null) return null;
        if(g.getIsFinished() == false) g.setAnswer(0);
        return g;
    }
    
    public List<Round> getRounds(int id){
        return dao.getRounds(id);
    }
    
    public boolean updateGame(Game game){
        return dao.updateGame(game);
    }
    
    public boolean updateRound(Round round){
        return dao.updateRound(round);
    }
    
    public boolean deleteGame(int id){
        return dao.deleteGameById(id);
    }
    
    public boolean deleteRound(int id){
        return dao.deleteRoundById(id);
    }
    
    public int generate(){
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            digits.add(i);
        }
        
        Collections.shuffle(digits);
        
        String result = "";
        for(int i = 0; i < 4; i++){
            result += digits.get(i).toString();
        }
        return Integer.parseInt(result);
    }
    
    public List<Integer> calculateGuess(int guess, int answer){
        int exact = 0, partial = 0;
        String g = Integer.toString(guess);
        String a = Integer.toString(answer);
        for(int i = 0; i < g.length(); i++){
            if(g.charAt(i) == a.charAt(i)){
                exact++;
            }else if(a.indexOf(g.charAt(i)) != -1){
                partial++;
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(exact);
        result.add(partial);
        return result;
    }
    
    public boolean checkById(int id){
        List<Game> list = dao.getAllGames();
        for(Game g : list){
            if(g.getId() == id)
                return true;
        }
        return false;
    }
}
