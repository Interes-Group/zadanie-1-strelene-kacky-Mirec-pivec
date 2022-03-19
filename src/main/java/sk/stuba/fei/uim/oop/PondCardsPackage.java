package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.Player;
import sk.stuba.fei.uim.oop.PondCards.DuckCard;
import sk.stuba.fei.uim.oop.PondCards.PondCard;
import sk.stuba.fei.uim.oop.PondCards.WaterCard;

import java.util.ArrayList;
import java.util.Collections;

public class PondCardsPackage {
    private ArrayList<PondCard> cardsPackage;

    PondCardsPackage(Player[] players) {
        this.cardsPackage = new ArrayList<>();
        this.generatePackage(players);
        Collections.shuffle(this.getCardsPackage());
    }

    public void generatePackage(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            generateDucksForPlayer(players[i]);
            PondCard water = new WaterCard();
            cardsPackage.add(water);
        }
    }

    public void addCardsFromPond(GameTable table) {
        this.cardsPackage.addAll(table.getBoard().pondPlaces);
    }

    public ArrayList<PondCard> getCardsPackage() {
        return cardsPackage;
    }

    public PondCard cardOnTop() {
        return cardsPackage.get(0);
    }

    public void removeCardOnTop() {
        cardsPackage.remove(0);
    }

    private void generateDucksForPlayer(Player player) {
        for (int j = 0; j < 5; j++) {
            PondCard duck = new DuckCard(player);
            cardsPackage.add(duck);
        }
    }
}
