package com.example.lindborg.lab2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;


public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
    }

}
