package com.example.dunk.rockpaperscissors.enums;

public enum SelectionType {

    ROCK("Scissors"),
    PAPER("Rock"),
    SCISSORS("Paper");

    private final String losingHand;

    SelectionType(String losingHand){
        this.losingHand = losingHand;
    }

    public String getLosingHand() {
        return losingHand;
    }
}
