package com.example.shilpysamaddar.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by shilpysamaddar on 09/01/17.
 */

public class WinnnerLayout extends AppCompatActivity {
    TextView winnerText;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winner_layout);
        winnerText=(TextView) findViewById(R.id.winnerText);
        Intent intent = getIntent();
       text=intent.getStringExtra("text").toString();
        winnerText.setText(text);
    }
}
