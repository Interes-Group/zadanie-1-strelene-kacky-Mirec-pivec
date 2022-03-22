package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public abstract class PondCard {
    protected String name;

    public PondCard(){
    }

    public abstract String printPondCard();

    public abstract void wasShot(GameTable table, int chosenPlace);

    public abstract void turboDuckAction(GameTable table, int chosenSpot);

    public int verifyTurboDuck(int chosenSpot){
        while ((chosenSpot < 1) || (chosenSpot > 6)){
            chosenSpot = ZKlavesnice.readInt("please insert number between 1-6");
        }
        return chosenSpot;
    }
}
