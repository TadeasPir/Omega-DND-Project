package com.example.omega;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Throws extends AppCompatActivity {
   private Button button;
   private Button saveThrows;
    ArrayList<Integer> list = new ArrayList<>();
    EditText strength;
    EditText dexterity;
    EditText constitution;
    EditText intelligence;
    EditText wisdom;
    EditText charisma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_throws);
        TextView textView = (TextView) findViewById(R.id.textViewPrintDice);
        button = (Button) findViewById(R.id.rollButton);
        saveThrows = (Button) findViewById(R.id.saveButtonThrow);
        strength = (EditText) findViewById(R.id.editTextStrength);
        dexterity = (EditText) findViewById(R.id.editTextDexterity);
        charisma = (EditText) findViewById(R.id.editTextCharisma);
        constitution = (EditText) findViewById(R.id.editTextConstitution);
        wisdom = (EditText) findViewById(R.id.editTextWisdom);
        intelligence = (EditText) findViewById(R.id.editTextIntelligence);

            saveThrows.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Takes the appropriate data from each UI element using the getText and toString methods
                    try {

                        CharacterCreation.character.setStrength(Integer.parseInt(strength.getText().toString()));
                        CharacterCreation.character.setDexterity(Integer.parseInt(dexterity.getText().toString()));
                        CharacterCreation.character.setConstitution(Integer.parseInt(constitution.getText().toString()));
                        CharacterCreation.character.setIntelligence(Integer.parseInt(intelligence.getText().toString()));
                        CharacterCreation.character.setWisdom(Integer.parseInt(wisdom.getText().toString()));
                        CharacterCreation.character.setCharisma(Integer.parseInt(charisma.getText().toString()));
                        Toast.makeText(Throws.this, "saved", Toast.LENGTH_SHORT).show();
                        // Write the updated Character object to a CSV file
                        Writing.write(CharacterCreation.character);
                    }catch (NumberFormatException e){
                        Toast.makeText(Throws.this, "please fill in some values in first", Toast.LENGTH_SHORT).show();
                    }
                    catch (IndexOutOfBoundsException e){
                        Toast.makeText(Throws.this, "value limit for abilities is 20", Toast.LENGTH_SHORT).show();
                    }

                }
            });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.clear();
                Dice.roll(list);
                textView.setText(list.toString());
            }

        });

    }
}