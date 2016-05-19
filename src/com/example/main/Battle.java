package com.example.main;

import javax.swing.*;

/**
 * Computes and manages the battle between two players.
 * Created by codysmac on 5/17/16.
 */
public class Battle {
    Player player1, player2;

    /**
     * Sets the number of wins for the player
     * @param player the player that won the match
     */
    private void wins(Player player){
        int win = 1;
        player.setWins(win);
    }

    /**
     * Starts the game and gathers the information.
     */
    public void start(){
        int numberOfPlayers = Integer.parseInt(JOptionPane.showInputDialog("How many players"));
            player1 = new Player(JOptionPane.showInputDialog("What is your name?"));
        if(numberOfPlayers == 1){
            player2 = new Player("Computer");
        }
        else if(numberOfPlayers == 2){
            player2 = new Player(JOptionPane.showInputDialog("What is the second player name?"));
        }

    }

    /**
     * Executes each round/match of the game
     */
    public void round(){
            if (player2.getName().equals("Computer")) {
                battle(JOptionPane.showInputDialog("Player 1 enter: paper; rock; or scissors"),
                        new Computer().choice());
            } else {
                battle(JOptionPane.showInputDialog("Player 1 enter: paper; rock; or scissors"),
                        JOptionPane.showInputDialog("Player 2 enter: paper; rock; or scissors"));
            }
    }

    /**
     * Gets the final scores of each player, displays them and who won.
     */
    public void getScores(){
        String p1 = "Player 1 has " + Integer.toString(player1.getWins());
        String p2 = "Player 2 has " + Integer.toString(player2.getWins());
        String winner = "tie";
        if(player1.getWins()>player2.getWins()){
            winner = player1.getName() + " wins!!!!";
        }
        else if(player2.getWins()>player1.getWins()){
            winner = player2.getName() + " Wins!!!";
        }
        JOptionPane.showMessageDialog(null, (p1 + "\n" + p2 + "\n" + winner));
    }

    /**
     * Performs the battle between players.
     * @param playerchoice player 1's choice.
     * @param player2choice player 2's choice.
     */
    private void battle(String playerchoice, String player2choice){
        for(int i = 1; i<4; i++){
            if (choice(playerchoice) == i && choice(player2choice) == i){
                System.out.println("tie");
                break;
            }
            else if(i + 1 == 4) {
                System.out.println("i + 1 = 4");
                System.out.println(choice(playerchoice) + " player 1 choice");
                System.out.println(choice(player2choice) + " player 2 choice");
                if(choice(playerchoice) == 1 && choice(player2choice) == 3){
                    System.out.println("player 1 wins");
                    break;
                }
                System.out.println("player 2 wins");
                wins(player2);
                break;
            }
            if(choice(playerchoice) == i && choice(player2choice) == i+1){
                System.out.println(choice(playerchoice) + " player 1 choice");
                System.out.println(choice(player2choice) + " player 2 choice");
                System.out.println("player2 wins");
                wins(player2);
                break;
            }
            else if(choice(playerchoice) == i+1 && choice(player2choice) == i){
                System.out.println(choice(playerchoice) + " player 1 choice");
                System.out.println(choice(player2choice) + " player 2 choice");
                System.out.println("player1 wins");
                wins(player1);
                break;
            }
        }
    }

    /**
     * turns the string value into an int value for processing.
     * @param playerchoice string value of the players choice.
     * @return the int value of the players choice.
     */
    private int choice (String playerchoice){
        if(playerchoice.equals("rock")){
            return 1;
        }
        else if(playerchoice.equals("paper")){
            return 2;
        }
        else if(playerchoice.equals("scissors")){
            return 3;
        }
        return 0;
    }
}
