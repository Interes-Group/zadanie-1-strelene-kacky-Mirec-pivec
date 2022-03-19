package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;

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


}
