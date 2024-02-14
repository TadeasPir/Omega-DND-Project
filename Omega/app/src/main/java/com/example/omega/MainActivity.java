package com.example.omega;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        File myObj = new File("/data/data/com.example.omega/file.csv");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.createChar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a new activity of the CharacterCreation class using an Intent
                startActivity(new Intent(MainActivity.this,CharacterCreation.class));
            }
        });
        b2 = (Button) findViewById(R.id.loadChar);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a new activity of the CharacterLoad class using an Intent
                startActivity(new Intent(MainActivity.this,CharacterLoad.class));
            }
        });


    }

}