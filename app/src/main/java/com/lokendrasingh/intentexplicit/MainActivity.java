package com.lokendrasingh.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private Button clickbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= findViewById(R.id.username);
        clickbtn= findViewById(R.id.button);
        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name= username.getText().toString();
                Intent intent= new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra("username",user_name);
                startActivity(intent);
            }
        });
    }
}