/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: DAO Implementation for Guess The Number Assignment
 */
package com.mm.guessthenumber.dao;

import com.mm.guessthenumber.entity.Game;
import com.mm.guessthenumber.entity.Round;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;

@Repository
public class GuessTheNumberDaoImpl implements GuessTheNumberDao{
    private final JdbcTemplate jdbcTemplate;
    
    public GuessTheNumberDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public Game addGame(Game game) {
        final String sql = "INSERT INTO Game(IsFinished, Answer) VALUES(?,?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                sql, 
                Statement.RETURN_GENERATED_KEYS);

            statement.setBoolean(1, game.getIsFinished());
            statement.setInt(2, game.getAnswer());
            return statement;

        }, keyHolder);

        game.setId(keyHolder.getKey().intValue());

        return game;
    }
    
    @Override
    public Round addRound(Round round) {
        final String sql = "INSERT INTO Round(Time, Result, GameId)"
                + " VALUES(?,?,?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update((Connection conn) -> {

            PreparedStatement statement = conn.prepareStatement(
                sql, 
                Statement.RETURN_GENERATED_KEYS);

            statement.setTimestamp(1, round.getTime());
            statement.setString(2, round.getResult());
            statement.setInt(3, round.getGameId());
            return statement;

        }, keyHolder);

        round.setRoundId(keyHolder.getKey().intValue());

        return round;
    }

    @Override
    public List<Game> getAllGames() {
        final String sql = "SELECT GameId, IsFinished, Answer FROM Game;";
        return jdbcTemplate.query(sql, new GameMapper());
    }

    @Override
    public Game findGameById(int id) {
        final String sql = "SELECT GameId, IsFinished, Answer "
                + "FROM Game WHERE GameId = ?;";

        return jdbcTemplate.queryForObject(sql, new GameMapper(), id);
    }
    
    @Override
    public List<Round> getRounds(int id) {
        final String sql = "SELECT RoundId, Time, Result, GameId "
                + "FROM Round WHERE GameId = ? ORDER BY Time;";
        
        return jdbcTemplate.query(sql, new RoundMapper(), id);
    }

    @Override
    public boolean updateGame(Game game) {
        final String sql = "UPDATE Game SET "
                + "IsFinished = ?, "
                + "Answer = ? "
                + "WHERE GameId = ?;";

        return jdbcTemplate.update(sql,
                game.getIsFinished(),
                game.getAnswer(),
                game.getId()) > 0;
    }
    
    @Override
    public boolean updateRound(Round round) {
        final String sql = "UPDATE Round SET "
                + "Time = ?, "
                + "Result = ? "
                + "GameId = ?"
                + "WHERE RoundId = ?;";

        return jdbcTemplate.update(sql,
                round.getTime(),
                round.getResult(),
                round.getGameId(),
                round.getRoundId()) > 0;
    }

    @Override
    public boolean deleteGameById(int id) {
        final String sql = "DELETE FROM Game WHERE GameId = ?;";
        return jdbcTemplate.update(sql, id) > 0;
    }
    
    @Override
    public boolean deleteRoundById(int id) {
        final String sql = "DELETE FROM Round WHERE RoundId = ?;";
        return jdbcTemplate.update(sql, id) > 0;
    }
    
    private static final class GameMapper implements RowMapper<Game> {

        @Override
        public Game mapRow(ResultSet rs, int index) throws SQLException {
            Game td = new Game();
            td.setId(rs.getInt("GameId"));
            td.setIsFinished(rs.getBoolean("IsFinished"));
            td.setAnswer(rs.getInt("Answer"));
            return td;
        }
    }
    
    private static final class RoundMapper implements RowMapper<Round> {
        @Override
        public Round mapRow(ResultSet rs, int index) throws SQLException {
            Round td = new Round();
            td.setRoundId(rs.getInt("RoundId"));
            td.setTime(rs.getTimestamp("Time"));
            td.setResult(rs.getString("Result"));
            td.setGameId(rs.getInt("GameId"));
            return td;
        }
    }
}
