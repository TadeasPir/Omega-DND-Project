package com.example.omega;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.io.BufferedWriter;

public class CharacterCreation extends AppCompatActivity {
   private Button btnBack;
   private Button b3;
   private Button save;


    static Character character = new Character(null, null,null,null,null,null,null,0,0,0,0,0,0);
    EditText charNameText;
    EditText playerNameText;
    EditText backgroundText;
    EditText expText;
    EditText classALvlText;
    EditText raceText;
    EditText alignmentText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creation);
        charNameText = (EditText) findViewById(R.id.textCharacterName);
        playerNameText = (EditText) findViewById(R.id.textPlayerName);
        backgroundText = (EditText) findViewById(R.id.textBackground);
        expText = (EditText) findViewById(R.id.textExperiencePoints);
        classALvlText = (EditText) findViewById(R.id.textClassLevel);
        raceText = (EditText) findViewById(R.id.textRace);
        alignmentText = (EditText) findViewById(R.id.textAlignment);
        save = (Button) findViewById(R.id.saveButton);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Handles the onClick event for a View.
             *
             * Saves the entered data from the UI elements into a Character object.
             * Writes the Character object to a CSV file.
             * Displays a toast message to indicate that the data has been saved.
             *
             * @param v The View that was clicked.
             */
            public void onClick(View v) {
                // Set the entered data from the UI elements into the Character object
                try {
                    character.setCharName(String.valueOf(charNameText.getText()));
                    character.setPlayerName(String.valueOf(playerNameText.getText()));
                    character.setBackground(String.valueOf(backgroundText.getText()));
                    character.setExp(String.valueOf(expText.getText()));
                    character.setClassALevel(String.valueOf(classALvlText.getText()));
                    character.setRace(String.valueOf(raceText.getText()));
                    character.setAlignment(String.valueOf(alignmentText.getText()));
                    Toast.makeText(CharacterCreation.this, "Saved", Toast.LENGTH_SHORT).show();
                    // Write the Character object to a CSV file using the write() method from the Writing class
                    Writing.write(CharacterCreation.character);
                }catch (NumberFormatException e){
                    Toast.makeText(CharacterCreation.this, "please limit text length to 40 characters", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3 = (Button) findViewById(R.id.throwsButton);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a new activity of the Throws class using an Intent
                startActivity(new Intent(CharacterCreation.this,Throws.class));
            }
        });
    }
}