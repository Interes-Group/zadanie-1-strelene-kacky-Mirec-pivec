package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;

public abstract class PondCard {
    protected String name;

    public PondCard(){
    }

    public abstract String printPondCard();

    public abstract void wasShot(GameTable table, int chosenPlace);

    public abstract void turboDuckAction(GameTable table, int chosenSpot);

    // sem to chce ešte overenie inputu ako v action kartach
}
