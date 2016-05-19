package com.example.main;

/**
 * Created by codysmac on 5/17/16.
 */
public class Player {

    private String name;
    private int wins;

    /**
     * Sets the name of the player.
     * @param name the name of the player.
     */
    public Player(String name){
        this.name = name;
    }

    /**
     * gets the name of the player.
     * @return the name of the player.
     */
    public String getName(){
        return this.name;
    }

    /**
     * gets score for the player.
     * @return the score for the player.
     */
    public int getWins(){
        return this.wins;
    }

    /**
     * Increments the overall number of points for the player.
     * @param wins the number of points to increase by.
     */
    public void setWins(int wins){
        System.out.println(wins + " inputed in wins parameter for " + this.name);
        this.wins += wins;
        System.out.println(this.wins + " inputed in the global wins varaible " + this.name);
    }


}
