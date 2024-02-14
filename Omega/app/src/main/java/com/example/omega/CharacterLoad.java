package com.example.omega;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class CharacterLoad extends AppCompatActivity {
        Button load;
     Character character1 = new Character(null, null,null,null,null,null,null,0,0,0,0,0,0);
    TextView charNameText;
    TextView playerNameText;
    TextView backgroundText;
    TextView expText;
    TextView classALvlText;
    TextView raceText;
    TextView alignmentText;
    TextView strength;
    TextView dexterity;
    TextView constitution;
    TextView intelligence;
    TextView wisdom;
    TextView charisma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_load);
        load = (Button) findViewById(R.id.loadButton);
        charNameText = (TextView) findViewById(R.id.CharNameLoad);
        playerNameText = (TextView) findViewById(R.id.playerNameLoad);
        backgroundText = (TextView) findViewById(R.id.backgroundLoad);
        expText = (TextView) findViewById(R.id.expLoad);
        classALvlText = (TextView) findViewById(R.id.classAndLevelLoad);
        raceText = (TextView) findViewById(R.id.raceLoad);
        alignmentText = (TextView) findViewById(R.id.alignmentLoad);
        strength = (TextView) findViewById(R.id.strengthLoad);
        dexterity = (TextView) findViewById(R.id.dexterityLoad);
        constitution = (TextView) findViewById(R.id.constitutionLoad);
        intelligence = (TextView) findViewById(R.id.intelligenceLoad);
        wisdom = (TextView) findViewById(R.id.wisdomLoad);
        charisma = (TextView) findViewById(R.id.charismaLoad);
        load.setOnClickListener(new View.OnClickListener() {
            /**
             * Handles the onClick event for a View.
             *
             * Reads a Character object from a CSV file and populates the UI elements with the character's data.
             * Sets the appropriate text for each UI element based on the character's properties.
             *
             * @param v The View that was clicked.
             * @throws RuntimeException If an I/O error occurs while reading the file.
             * @throws NumberFormatException If an text is too long.
             */
            @Override
            public void onClick(View v) {
                try {
                    // Read a Character object from the CSV file using the read() method from the Writing class
                    character1 = Writing.read();
                    // Set the appropriate text for each UI element using the character's data
                    charNameText.setText("Character name: "+character1.getCharName());
                    playerNameText.setText("Player name: "+character1.getPlayerName());
                    backgroundText.setText("Background: "+character1.getBackground());
                    expText.setText("Experience points: "+character1.getExp());
                    classALvlText.setText("Class and level: "+character1.getClassALevel());
                    raceText.setText("Race: "+character1.getRace());
                    alignmentText.setText("Alignment: "+character1.getAlignment());
                    strength.setText("Strength: "+character1.getStrength());
                    dexterity.setText("Dexterity: "+character1.getDexterity());
                    constitution.setText("Constitution: "+character1.getConstitution());
                    intelligence.setText("Intelligence: "+character1.getIntelligence());
                    wisdom.setText("Wisdom: "+character1.getWisdom());
                    charisma.setText("Charisma: "+character1.getCharisma());
                    Toast.makeText(CharacterLoad.this, "loaded", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(CharacterLoad.this, "please limit text length", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}