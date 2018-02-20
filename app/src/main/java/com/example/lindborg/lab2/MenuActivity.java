package com.example.lindborg.lab2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends Activity {

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();

        final Intent help = new Intent(this, HelpActivity.class);
        final Intent highScore = new Intent(this, HighScoreActivity.class);
        final Intent play = new Intent(this, PlayActivity.class);
        final Button helpButton = findViewById(R.id.button4);
        final Button highScoreButton = findViewById(R.id.button3);
        final Button playButton = findViewById(R.id.button2);

        sharedpreferences = getSharedPreferences("MegaBlasterZapperPrefs", Context.MODE_PRIVATE);

        sharedpreferences.getInt("HighScore",0);

        helpButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(help);
            }
        });

        highScoreButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(highScore);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(play);
            }
        });

    }

}
