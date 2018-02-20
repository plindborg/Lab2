package com.example.lindborg.lab2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HighScoreActivity extends Activity {
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        final TextView highScoreText = findViewById(R.id.textView6);
        final TextView levelText = findViewById(R.id.textView8);

        sharedpreferences = getSharedPreferences("MegaBlasterZapperPrefs", Context.MODE_PRIVATE);

        Integer highscore = sharedpreferences.getInt("HighScore",0);
        Integer level = sharedpreferences.getInt("Level",0);

        highScoreText.setText(highscore.toString());
        levelText.setText(level.toString());

    }
}
