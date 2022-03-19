package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.PondCards.PondCard;

public class DuckMarchCard extends ActionCard {
    private final String name;

    public DuckMarchCard(){
        this.name = "Duck march card";
    }

    @Override
    public void action(GameTable table) {
        table.getPondPackage().getCardsPackage().add(table.getBoard().pondPlaces.get(0));
        //možno dupilcita? who knows
        for (int pondPlaceIndex = 5; pondPlaceIndex > 0; pondPlaceIndex--) {
            PondCard tmp = table.getBoard().pondPlaces.get(pondPlaceIndex - 1);
            table.getBoard().pondPlaces.set(pondPlaceIndex - 1, table.getBoard().pondPlaces.get(5));
            table.getBoard().pondPlaces.set(5, tmp);
        }
        table.getBoard().pondPlaces.set(5, table.getPondPackage().cardOnTop());
        table.getPondPackage().removeCardOnTop();
    }

    @Override
    public boolean canBePlayed(GameTable table) {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
