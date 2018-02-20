package com.example.lindborg.lab2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    public static final String MyPREFERENCES = "MegaBlasterZapperPrefs" ;
    public static final String score = "HighScore";
    public static final String level = "Level";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        final Button button = findViewById(R.id.button);

        final Intent menu = new Intent(this, MenuActivity.class);
        

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putInt(score,0);
                editor.putInt(level,0);
                editor.commit();
                startActivity(menu);

            }
        });
    }
}
