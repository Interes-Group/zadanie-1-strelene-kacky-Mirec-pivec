package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.ActionCards.ActionCard;
import sk.stuba.fei.uim.oop.GameTable;

import java.util.Collections;

public class Scatter extends ActionCard {
    private String name = "Scatter card";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean canBePlayed(GameTable table) {
        return true;
    }

    @Override
    public void action(GameTable table) {
        Collections.shuffle(table.getBoard().pondPlaces);
    }
}
