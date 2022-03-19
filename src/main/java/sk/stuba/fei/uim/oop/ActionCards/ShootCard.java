package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class ShootCard extends ActionCard {

    @Override
    public void action(GameTable table) {
        int chosenIndex = ZKlavesnice.readInt("Insert number which place you want use your card on");
        while ((chosenIndex < 1)||( chosenIndex > 6)) {
            chosenIndex = ZKlavesnice.readInt("Insert number between 1-6 please");
        }
        while (table.getBoard().aimPlaces[chosenIndex].equals("Not aimed")){
            chosenIndex = ZKlavesnice.readInt("You need to choose aimed place, try again");
        }
        table.getBoard().pondPlaces.get(chosenIndex - 1).wasShot();
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
        return null;
    }
}
