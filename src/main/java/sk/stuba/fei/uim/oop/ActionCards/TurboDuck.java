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
        int chosenSpot = ZKlavesnice.readInt("Insert place of duck you want to move please");
        while ((chosenSpot < 1) || (chosenSpot > 6)) {
            chosenSpot = ZKlavesnice.readInt("Insert number between 1-6 please");
        }
        table.getBoard().pondPlaces.get(chosenSpot - 1).turboDuckAction(table, chosenSpot - 1);
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
