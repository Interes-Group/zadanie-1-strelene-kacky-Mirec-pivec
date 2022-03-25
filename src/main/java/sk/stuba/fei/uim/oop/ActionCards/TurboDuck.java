package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.PondCards.PondCard;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class TurboDuck extends ActionCard {
    private final String name;

    public TurboDuck() {
        this.name = "Turbo duck card";
    }

    @Override
    public void action(GameTable table) {

        int chosenSpot = super.verifyOthers();
        table.getBoard().pondPlaces.get(chosenSpot - 1).turboDuckAction(table, chosenSpot);
    }

    @Override
    public boolean canBePlayed(GameTable table) {
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
