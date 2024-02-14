package com.example.omega;

import android.os.LimitExceededException;
import android.widget.Toast;

public class Character {
    private String charName;
    private String playerName;
    private String background;
    private String alignment;
    private String race;
    private String classALevel;
    private String exp;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;


    public Character(String charName, String playerName, String background, String alignment, String race, String classALevel, String exp, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.charName = charName;
        this.playerName = playerName;
        this.background = background;
        this.alignment = alignment;
        this.race = race;
        this.classALevel = classALevel;
        this.exp = exp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName){
        if(charName.length() > 40){
            throw new NumberFormatException("text can't be longer than 40 characters");
        }else {
            this.charName = charName;
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        if(playerName.length() > 40){
            throw new NumberFormatException("text can't be longer than 40 characters");
        }else {
            this.playerName = playerName;
        }
    }


    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        if(background.length() > 40){
            throw new NumberFormatException("text can't be longer than 40 characters");
        }else {
            this.background = background;
        }
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        if(alignment.length() > 40){
            throw new NumberFormatException("text can't be longer than 40 characters");
        }else {
            this.alignment = alignment;
        }
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        if(race.length() > 40){
            throw new NumberFormatException("text can't be longer than 40 characters");
        }else {
            this.race = race;
        }
    }

    public String getClassALevel() {
        return classALevel;
    }

    public void setClassALevel(String classALevel) {
        if(classALevel.length() > 40){
            throw new NumberFormatException("text can't be longer than 40 characters");
        }else {
            this.classALevel = classALevel;
        }
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        if(exp.length() > 40){
            throw new NumberFormatException("text can't be longer than 40 characters");
        }else {
            this.exp = exp;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if(strength <= 20){
            this.strength = strength;
        } else {
            throw new IndexOutOfBoundsException("Value can't be larger than 20");
        }
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        if(dexterity <= 20){
        this.dexterity = dexterity;
    } else {
        throw new IndexOutOfBoundsException("Value can't be larger than 20");
        }
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        if(constitution <= 20){
            this.constitution = constitution;
        } else {
            throw new IndexOutOfBoundsException("Value can't be larger than 20");
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if(intelligence <= 20){
            this.intelligence = intelligence;
        } else {
            throw new IndexOutOfBoundsException("Value can't be larger than 20");
        }
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if(wisdom <= 20){
            this.wisdom = wisdom;
        } else {
            throw new IndexOutOfBoundsException("Value can't be larger than 20");
        }
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        if(charisma <= 20){
            this.charisma = charisma;
        } else {
            throw new IndexOutOfBoundsException("Value can't be larger than 20");
        }
    }
}