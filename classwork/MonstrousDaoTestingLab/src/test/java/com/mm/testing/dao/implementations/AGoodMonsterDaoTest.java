/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.testing.dao.implementations;

import com.mm.testing.dao.MonsterDao;
import com.mm.testing.model.Monster;
import com.mm.testing.model.MonsterType;
import java.io.FileNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AGoodMonsterDaoTest {
    
    MonsterDao dao = new AGoodMonsterDao();
    
    public AGoodMonsterDaoTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
        
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
        
    }

    @Test
    public void testCreateValidMonster() {
        Monster m = new Monster();
        m.setName("Booga");
        m.setType(MonsterType.YETI);
        m.setPeopleEaten(4);
        m.setFavoriteFood("Mutton Stir Fry");
        try{
            dao.addMonster(1, m);
        }catch(Exception e){
            fail("Monster was valid. No Exception should be thrown.");
        }
    }
}
