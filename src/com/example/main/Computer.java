package com.example.main;

import javax.swing.*;
import java.util.Random;

/**
 * Creates the computer AI to play against the player.
 * Created by codysmac on 5/18/16.
 */
public class Computer {
    /**
     * Randomly selects an option to play against player
     * @return the computers selection, should never return null.
     */
    public String choice(){
        Random choice = new Random();
        final int number = choice.nextInt(3);
        if(number==0){
            System.out.println("computer plays rock");
            JOptionPane.showMessageDialog(null, "Computer plays Rock");
            return "rock";
        }
        else if(number==1){
            System.out.println("computer plays paper");
            JOptionPane.showMessageDialog(null, "Computer plays Paper");
            return "paper";
        }
        else if(number==2){
            System.out.println("computer plays scissors");
            JOptionPane.showMessageDialog(null, "Computer plays Scissors");
            return "scissors";
        }
        return null;
    }
}
