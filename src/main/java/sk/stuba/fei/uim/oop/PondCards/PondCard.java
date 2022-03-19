package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;

public abstract class PondCard {
    protected String name;

    public PondCard(){
    }

    public abstract String printPondCard();

    public abstract void wasShot();
}
