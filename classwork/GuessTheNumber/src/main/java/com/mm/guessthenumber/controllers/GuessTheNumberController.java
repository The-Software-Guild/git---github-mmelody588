/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: Controller Class for Guess The Number Assignment
 */
package com.mm.guessthenumber.controllers;

import com.mm.guessthenumber.entity.Game;
import com.mm.guessthenumber.entity.Round;
import com.mm.guessthenumber.service.GuessTheNumberService;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/guessthenumber")
public class GuessTheNumberController {
    private final GuessTheNumberService service;
    
    public GuessTheNumberController(GuessTheNumberService service){
        this.service = service;
    }
    
    @PostMapping("/begin")
    public int begin(){
        Game g = new Game();
        g.setAnswer(service.generate());
        g.setIsFinished(false);
        g = service.addGame(g);
        return g.getId();
    }
    
    @PostMapping("/guess")
    public Round guess(int guess, int id){
        boolean b = service.checkById(id);
        if(b == false) {
            return null;
        }
        Game g = service.getGame(id);
        long now = System.currentTimeMillis();
        Timestamp time = new Timestamp(now);
        List<Integer> result = service.calculateGuess(guess, g.getAnswer());
        Round rd = new Round();
        rd.setTime(time);
        rd.setResult("e:" + result.get(0) + ":p:" + result.get(1));
        rd.setGameId(id);
        return service.addRound(rd);
    }
    
    @GetMapping("/game")
    public List<Game> getAllGames(){
        List<Game> list = service.getAllGames();
        return list;
    }
    
    @GetMapping("/game/{gameId}")
    public ResponseEntity<Game> getGame(@PathVariable int gameId){
        Game g = service.getGame(gameId);
        if(g == null){
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(g);
    }
    
    @GetMapping("/round/{gameId}")
    public List<Round> getRounds(int gameId){
        return service.getRounds(gameId);
    }
}
