/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: DAO Interface for Guess The Number Assignment
 */
package com.mm.guessthenumber.dao;

import com.mm.guessthenumber.entity.Game;
import com.mm.guessthenumber.entity.Round;
import java.util.List;

public interface GuessTheNumberDao {
    Game addGame(Game game);
    
    Round addRound(Round round);

    List<Game> getAllGames();

    Game findGameById(int id);
    
    List<Round> getRounds(int id);

    boolean updateGame(Game game);
    
    boolean updateRound(Round round);

    boolean deleteGameById(int id);
    
    boolean deleteRoundById(int id);
}
