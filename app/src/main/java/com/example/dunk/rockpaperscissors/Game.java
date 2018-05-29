package com.example.dunk.rockpaperscissors;

import com.example.dunk.rockpaperscissors.enums.SelectionType;


class Game {

    String[] computerChoice =  new String[]{"ROCK", "PAPER", "SCISSORS"};


    public String playGame(SelectionType playerPlay){
        String computerPlay = computerChoice[(int) (Math.random() * computerChoice.length)];
//        String computerPlay = "Rock";
        if (playerPlay.toString() == computerPlay) {return "Draw";}
        else if (playerPlay.getLosingHand() == computerPlay) {return "you win";}
        else return "computer wins with " + computerPlay;
    }
}
