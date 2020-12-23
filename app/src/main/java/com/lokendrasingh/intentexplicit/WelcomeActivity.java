package com.lokendrasingh.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView textwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        String strusername= getIntent().getStringExtra("username");
        textwelcome= findViewById(R.id.welcome);
        textwelcome.setText("welcome "+strusername);
    }
}