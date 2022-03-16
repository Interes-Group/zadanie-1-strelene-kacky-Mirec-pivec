package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Player {
    private String name;
    private int lives;
    private ActionCard[] cards = new ActionCard[3];

    public Player(){
        name = ZKlavesnice.readString("input player's name please");
        lives = 5;
        this.generateCards();
    }

    public void generateCards(){
        for (int i = 0; i < 3 ; i++) {
            cards[i] = new AimCard();
        }
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

    public void useCard(ActionCard card, BoardTable board){
        card.action(board);
    }
}
