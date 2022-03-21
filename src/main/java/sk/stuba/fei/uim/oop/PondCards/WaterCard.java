package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class WaterCard extends PondCard {
    private String name = "Water";

    @Override
    public String printPondCard() {
        return name;
    }

    @Override
    public void wasShot() {
        System.out.println("You hit water");
    }

    @Override
    public void turboDuckAction(GameTable table) {
        int newIndex = ZKlavesnice.readInt("Can't use turboduck on water choose again");
        table.getBoard().pondPlaces.get(newIndex - 1).turboDuckAction(table);

    }


}
