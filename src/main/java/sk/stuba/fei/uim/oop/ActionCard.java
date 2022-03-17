package sk.stuba.fei.uim.oop;

public abstract class ActionCard {

    public ActionCard(){

    }

    public abstract void action(BoardTable board);

    public abstract boolean canBePlayed(BoardTable board);

    public abstract String getName();
}
