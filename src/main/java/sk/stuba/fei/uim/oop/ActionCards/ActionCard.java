package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;

public abstract class ActionCard {

    public ActionCard(){

    }

    public abstract void action(GameTable table);

    public abstract boolean canBePlayed(GameTable table);

    public abstract String getName();
}
