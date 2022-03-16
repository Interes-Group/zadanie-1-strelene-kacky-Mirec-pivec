package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Player {
    private String name;
    private int lives;

    public Player(){
        name = ZKlavesnice.readString("input player's name please");
        lives = 5;
    }

    public void printPlayersState(){
        System.out.println("players name " + name);
        System.out.println("has " + lives + " lives left");
    }

    public String getName() {
        return name;
    }

    public void duckShot(){
        lives--;
    }
}
