package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.PondCards.PondCard;

public class DuckMarchCard extends ActionCard {
    private final String name;

    public DuckMarchCard(){
        this.name = "Duck march card";
    }

    @Override
    public void action(GameTable table) {
        table.getPondPackage().getCardsPackage().add(table.getBoard().pondPlaces.get(0));
        table.getBoard().pondPlaces.remove(0);
        table.getBoard().pondPlaces.add(table.getPondPackage().cardOnTop());
        table.getPondPackage().removeCardOnTop();
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
