package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.ActionCards.ActionCard;
import sk.stuba.fei.uim.oop.ActionCards.AimCard;
import sk.stuba.fei.uim.oop.ActionCards.DuckMarchCard;
import sk.stuba.fei.uim.oop.ActionCards.TurboDuck;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.*;

public class Player {
    private String name;
    private int lives;
    private ArrayList<ActionCard> cards ;


    public Player(){
        this.name = ZKlavesnice.readString("input player's name please");
        this.lives = 5;
        this.cards = new ArrayList<ActionCard>(3);
    }

    public ArrayList<ActionCard> getCards() {
        return this.cards;
    }

    public void generateCards(ActionCardsPackage cardsPackage){
        for (int number = 0; number < 3; number++) {
            this.cards.add(cardsPackage.getCardsPackage().get(0));
            cardsPackage.getCardsPackage().remove(0);
        }
    }

    public void printPlayersState(){
        System.out.println("players name " + this.name);
        System.out.println("has " + this.lives + " lives left");
    }

    public void printCards(ArrayList<ActionCard> cards){
        for (int index = 0; index < 3; index++) {
            System.out.println((index + 1) + ". " + cards.get(index).getName());
        }
    }

    public String getName() {
        return this.name;
    }

    public void duckShot(GameTable table){
        this.lives--;
        if (this.isDead()){
            this.died(table);
        }
    }

    public void useCard(int indexOfCard,GameTable table){
        this.cards.get(indexOfCard).action(table);
        System.out.println(this.name + " used card " + this.cards.get(indexOfCard).getName());
        table.getActionPackage().getCardsPackage().add(this.cards.get(indexOfCard));
        this.cards.remove(indexOfCard);

        //potiahni si kartu z vrchu balicka
        this.cards.add(table.getActionPackage().getCardsPackage().get(0));
        table.getActionPackage().getCardsPackage().remove(0);
    }

    public void skipRound(GameTable table){
        this.cards.remove(2);
        this.cards.add(table.getActionPackage().getCardsPackage().get(0));
        table.getActionPackage().getCardsPackage().remove(0);
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

    public void died(GameTable table){
        for (int card = 0; card < 3;card++){
            table.getActionPackage().getCardsPackage().add(this.cards.get(0));
            this.cards.remove(0);
        }
    }
}
