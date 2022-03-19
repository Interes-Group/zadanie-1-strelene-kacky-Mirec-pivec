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

    public List<ActionCard> getCards() {
        return cards;
    }

    public void generateCards(){
        for (int i = 0; i < 1 ; i++) {
            AimCard aim = new AimCard();
            cards.add(aim);
        }
        DuckMarchCard duckMarch = new DuckMarchCard();
        cards.add(duckMarch);
        TurboDuck turbo = new TurboDuck();
        cards.add(turbo);
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

    public void useCard(int indexOfCard,GameTable table){
        cards.get(indexOfCard).action(table);
        System.out.println(this.name + " used card " + cards.get(indexOfCard).getName());
        //tu potom vymazat kartu cez remove
        // asi budem musiet passovat aj hracov
    }


}
