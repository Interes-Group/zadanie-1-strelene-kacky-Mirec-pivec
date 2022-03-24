package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public abstract class ActionCard {

    public ActionCard() {

    }

    public abstract void action(GameTable table);

    public abstract boolean canBePlayed(GameTable table);

    public abstract String getName();

    public int verifyAim(GameTable table,/* int aimedSpot,*/ String idk) {
        int chosenPlace = ZKlavesnice.readInt("choose place you want to target");
        while ((chosenPlace < 1) || (chosenPlace > 6)
                || (table.getBoard().aimPlaces[chosenPlace - 1].equals(idk))) {
            System.out.println("incorrect input");
            chosenPlace = ZKlavesnice.readInt("please try again");
        }
        return chosenPlace;
    }

    public int verifyOthers(){
        int place = ZKlavesnice.readInt("insert number");
        while((place < 1) || (place > 6)){
            System.out.println("incorrect input");
            place = ZKlavesnice.readInt("please try again");
        }
        return place;
    }
}
