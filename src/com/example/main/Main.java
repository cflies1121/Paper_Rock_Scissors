package com.example.main;

import javax.swing.*;

/**
 * Paper Rock Scissors text based game
 * Finished on Wed 5/18/2016
 * Created by codysmac on 5/17/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Battle a = new Battle();
            a.start();
            for (int i = 0; i < 3; i++) {
                a.round();//three rounds of prs
            }
            a.getScores();


        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Thanks for Playing!!! \n " +
            " You have ether pushed cancel or entered a bad value, remember to type everything exactly");// when cancel button is pushed exits the game
        }

    }

}
