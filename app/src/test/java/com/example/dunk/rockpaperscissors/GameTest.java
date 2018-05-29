package com.example.dunk.rockpaperscissors;

import org.junit.Test;

public class GameTest {

    Game game = new Game()

    @Test
    public void canPlayGame(){
        assertEquals("you win", game.gameWin());
    }
}
