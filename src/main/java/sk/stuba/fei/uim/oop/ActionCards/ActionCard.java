package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public abstract class ActionCard {

    public ActionCard(){

    }

    public abstract void action(GameTable table);

    public abstract boolean canBePlayed(GameTable table);

    public abstract String getName();

    public int verifyAimInput(GameTable table, int aimedSpot){
        //aimedSpot--;
        while ((aimedSpot < 1) || (aimedSpot > 6)
                || (table.getBoard().aimPlaces[aimedSpot - 1].equals("Aimed at"))){
            System.out.println("incorrect input");
            aimedSpot = ZKlavesnice.readInt("please try again");
        }
        return aimedSpot;
    }
}
