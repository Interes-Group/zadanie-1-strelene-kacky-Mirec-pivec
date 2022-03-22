package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class ShootCard extends ActionCard {
    private String name;

    @Override
    public void action(GameTable table) {
        int chosenPlace = this.idk(table);
        table.getBoard().pondPlaces.get(chosenPlace - 1).wasShot(table, chosenPlace);
        table.getBoard().aimPlaces[chosenPlace - 1] = "Not aimed at";
    }

    @Override
    public boolean canBePlayed(GameTable table) {
        for (int place = 0; place < 6; place++) {
            if (table.getBoard().aimPlaces[place].equals("Aimed at")){
                return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    protected int idk(GameTable table){
        int chosenPlace = super.verifyAim(table, "Aimed at");
        return chosenPlace;
    }
}
