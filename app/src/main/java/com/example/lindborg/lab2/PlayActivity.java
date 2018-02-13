package com.example.lindborg.lab2;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        final Button playButton = findViewById(R.id.button5);
        final EditText rightNumber = findViewById(R.id.editText);
        final EditText leftNumber = findViewById(R.id.editText2);
        final TextView resultView = findViewById(R.id.textView4);

        playButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Integer result = Integer.parseInt(leftNumber.getText().toString()) + Integer.parseInt(rightNumber.getText().toString());
                //Integer result = 5 + 5;
                resultView.setText(result.toString());
            }
        });
    }

}
