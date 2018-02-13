package com.example.lindborg.lab2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);

        final Intent menu = new Intent(this, MenuActivity.class);
        

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(menu);

            }
        });
    }
}
