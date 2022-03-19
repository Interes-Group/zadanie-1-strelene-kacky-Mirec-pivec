package sk.stuba.fei.uim.oop;

import java.util.Collections;

public class DuckDanceCard extends ActionCard{
    private final String name;

    public DuckDanceCard(){
        this.name = "Duck dance card";
    }

    @Override
    public void action(GameTable table) {
        table.getPondPackage().addCardsFromPond(table);
        Collections.shuffle(table.getPondPackage().getCardsPackage());
        for (int i = 0; i < 6; i++) {
            table.getBoard().pondPlaces.set(i, table.getPondPackage().cardOnTop());
            table.getPondPackage().removeCardOnTop();
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
