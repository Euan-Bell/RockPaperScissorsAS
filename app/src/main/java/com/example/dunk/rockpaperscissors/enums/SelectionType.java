package com.example.dunk.rockpaperscissors.enums;

public enum SelectionType {

    ROCK("SCISSORS"),
    PAPER("ROCK"),
    SCISSORS("PAPER");

    private final String losingHand;

    SelectionType(String losingHand){
        this.losingHand = losingHand;
    }

    public String getLosingHand() {
        return losingHand;
    }
}
