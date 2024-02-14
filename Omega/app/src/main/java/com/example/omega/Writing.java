package com.example.omega;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    /**
    *
    *  Converts character to CSV
    *
    *    @param character is transformed into String.
     */
    public static String toCsv(Character character){
        return character.getCharName()+","+ character.getPlayerName()+","+ character.getBackground()+","+character.getAlignment()+","+character.getRace()+","+character.getClassALevel()+","+character.getExp()+","+character.getStrength()+","+character.getDexterity()+","+character.getConstitution()+","+character.getIntelligence()+","+character.getWisdom()+","+character.getCharisma();
    }

    /**
     * Writes a character to a CSV file.
     *
     * @param character it's to be written to the CSV file.
     *
     * @throws RuntimeException If an I/O error occurs while writing the file.
     */
    public static void write(Character character){
        try {
            File myObj = new File("/data/data/com.example.omega/file.csv");
            myObj.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter("/data/data/com.example.omega/file.csv"));
            writer.write(toCsv(character));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Converts a CSV file into Character object.
     *
     * @return Character object.
     */
    public static Character fromCsv(String[] currentLine){
        String charName = currentLine[0];
        String playerName = currentLine[1];
        String background = currentLine[2];
        String alignment = currentLine[3];
        String race = currentLine[4];
        String classALevel = currentLine[5];
        String exp = currentLine[6];
        int strength = Integer.parseInt(currentLine[7]);
        int dexterity = Integer.parseInt(currentLine[8]);
        int constitution = Integer.parseInt(currentLine[9]);
        int intelligence = Integer.parseInt(currentLine[10]);
        int wisdom = Integer.parseInt(currentLine[11]);
        int charisma = Integer.parseInt(currentLine[12]);

        Character character = new Character(charName, playerName, background, alignment, race, classALevel,  exp,  strength,  dexterity,  constitution, intelligence,  wisdom,  charisma);


        return character;
    }

    /**
     * Reads a Character object from a CSV file.
     *
     * @return The Character object read from the CSV file.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static Character read() throws IOException {
        String currentLine;
        Character character = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader( "/data/data/com.example.omega/file.csv"));
            // Read each line from the file
            while ((currentLine = reader.readLine()) != null) {
               character = fromCsv(currentLine.split(","));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return character;
    }

}

