package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.*;

public class Player {
    private String name;
    private int lives;
    private List<ActionCard> cards ;


    public Player(){
        name = ZKlavesnice.readString("input player's name please");
        lives = 5;
        this.cards = new ArrayList<ActionCard>(3);
        this.generateCards();
    }

    public List<ActionCard> getCards() {
        return cards;
    }

    private void generateCards(){
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

    public void printCards(ArrayList<ActionCard> cards){
        for (int index = 0; index < 3; index++) {
            System.out.println((index + 1) + ". " + cards.get(index).getName());
        }
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

    public boolean isDead(){
        return this.lives < 1;
    }

    public boolean hasNothingToPlay(GameTable table){
        for (int cardNum = 0; cardNum < 3; cardNum++) {
            if (this.canPlayThis(this.cards.get(cardNum), table)){
                return false;
            }
        }
        return true;
    }

    public boolean canPlayThis(ActionCard card, GameTable table){
        if (card.canBePlayed(table)){
            return true;
        }
        return false;
    }

}
