package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.*;

public class Player {
    private String name;
    private int lives;
    private List<ActionCard> cards = new ArrayList<ActionCard>(3);


    public Player(){
        name = ZKlavesnice.readString("input player's name please");
        lives = 5;
        this.generateCards();
    }

    public void generateCards(){
        for (int i = 0; i < 2 ; i++) {
            AimCard aim = new AimCard();
            cards.add(aim);
        }
        DuckMarchCard duckMarch = new DuckMarchCard();
        cards.add(duckMarch);
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

    public void useCard(int indexOfCard, BoardTable board){
        cards.get(indexOfCard).action(board);
        System.out.println(this.name + " used card " + cards.get(indexOfCard).getName());
        //tu potom vymazat kartu cez remove
    }


}
