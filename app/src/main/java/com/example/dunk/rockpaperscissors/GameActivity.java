package com.example.dunk.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dunk.rockpaperscissors.enums.SelectionType;

public class GameActivity extends AppCompatActivity {

    Button rock;
    Button paper;
    Button scissors;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rock = findViewById(R.id.rock_button);
        paper = findViewById(R.id.paper_button);
        scissors = findViewById(R.id.scissors_button);
        result = findViewById(R.id.result_text);
    }

    public void onRockClicked(View view) {
        Game game = new Game();
        result.setText(game.playGame(SelectionType.ROCK));
    }

    public void onPaperClicked(View view) {
        Game game = new Game();
        result.setText(game.playGame(SelectionType.PAPER));
    }

    public void onScissorsClicked(View view) {
        Game game = new Game();
        result.setText(game.playGame(SelectionType.SCISSORS));
    }

}
