package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.PondCards.PondCard;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class TurboDuck extends ActionCard {
    private final String name;

    public TurboDuck() {
        this.name = "Turbo duck card";
    }

    @Override
    public void action(GameTable table) {
        int indexofChosen = ZKlavesnice.readInt("Insert place of duck you want to move please");
        while ((indexofChosen < 1) || (indexofChosen > 6)) {
            indexofChosen = ZKlavesnice.readInt("Insert number beetween 1-6 please");
        }
        //PondCard tmp = table.getBoard().pondPlaces.get(0);
        for (int counter = 0; counter < indexofChosen - 1; counter++) {
            PondCard tmp = table.getBoard().pondPlaces.get(0);
            table.getBoard().pondPlaces.set(0,table.getBoard().pondPlaces.get(counter + 1));
            table.getBoard().pondPlaces.set(counter + 1, tmp);
        }
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
