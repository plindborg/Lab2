package com.example.lindborg.lab2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class PlayActivity extends Activity {
    SharedPreferences sharedpreferences;
    int highScore = 0;
    int level = 0;
    Button playButton = null;
    TextView rightNumber = null;
    TextView leftNumber = null;
    EditText resultView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        playButton = findViewById(R.id.button5);
        rightNumber = findViewById(R.id.rightNumber);
        leftNumber = findViewById(R.id.leftNumber);
        resultView = findViewById(R.id.resultView);

        sharedpreferences = getSharedPreferences("MegaBlasterZapperPrefs", Context.MODE_PRIVATE);
        highScore = sharedpreferences.getInt("HighScore",0);
        level = sharedpreferences.getInt("Level",0);
        generateNewQuery(level);

        playButton.setOnClickListener(new View.OnClickListener() {

            SharedPreferences.Editor editor = sharedpreferences.edit();




            public void onClick(View v) {

                int rightNr = Integer.parseInt(rightNumber.getText().toString());
                int leftNr = Integer.parseInt(leftNumber.getText().toString());
                Integer result = leftNr + rightNr;
                Integer myResult = Integer.parseInt(resultView.getText().toString());
                if(myResult.equals(result)) {
                    editor.putInt("HighScore", ++highScore);
                    if(highScore >= 10 ) {
                        editor.putInt("Level", ++level);
                    }
                    editor.apply();
                    generateNewQuery(level);

                }

            }
        });
    }

    void generateNewQuery(Integer level) {
        Random rn = new Random();
        Integer randomLeft = rn.nextInt(100) + 1;
        Integer randomRight = rn.nextInt(100) + 1;
        leftNumber.setText(randomLeft.toString());
        rightNumber.setText(randomRight.toString());

    }

}
