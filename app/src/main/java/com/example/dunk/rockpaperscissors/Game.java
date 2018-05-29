package com.example.dunk.rockpaperscissors;

import com.example.dunk.rockpaperscissors.enums.SelectionType;


class Game {

    String[] computerChoice =  new String[]{"Rock", "Paper", "Scissors"};


    public String playGame(SelectionType playerPlay){
        String computerPlay = computerChoice[(int) (Math.random() * computerChoice.length)];
//        String computerPlay = "Rock";
        if (playerPlay.toString() == computerPlay){return "Draw";}
        if (playerPlay.getLosingHand() == computerPlay){return "you win";}
        else return "computer wins";
    }
}
