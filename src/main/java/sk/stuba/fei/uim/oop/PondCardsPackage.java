package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.Player;
import sk.stuba.fei.uim.oop.PondCards.DuckCard;
import sk.stuba.fei.uim.oop.PondCards.PondCard;
import sk.stuba.fei.uim.oop.PondCards.WaterCard;

import java.util.ArrayList;

public class PondCardsPackage {
    private ArrayList<PondCard> cardsPackage = new ArrayList<>();

    PondCardsPackage(){

    }

    public void generatePackage(Player[] players){
        for (int i = 0; i < players.length; i++){
            for(int j =0; j < 5; j++) {
                PondCard duck = new DuckCard(players[i]);
                cardsPackage.add(duck);
            }
            PondCard water = new WaterCard();
            cardsPackage.add(water);
        }
    }

    public ArrayList<PondCard> getCardsPackage() {
        return cardsPackage;
    }
}
