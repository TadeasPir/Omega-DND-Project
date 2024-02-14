package com.example.omega;

import java.util.ArrayList;
import java.util.Random;

public class Dice {

    static Random rnd = new Random();

    /**
     * Rolls a twenty-sided dice six times and adds the results to an ArrayList.
     *
     * @param list The ArrayList to store the rolled numbers.
     * @return The ArrayList with the rolled numbers.
     */
     public static ArrayList roll(ArrayList <Integer> list){
        int number;
        for (int i = 0; i < 6; i++){
            number = rnd.nextInt(19)+1;
            list.add(number);
        }
        return list;
    }
}
