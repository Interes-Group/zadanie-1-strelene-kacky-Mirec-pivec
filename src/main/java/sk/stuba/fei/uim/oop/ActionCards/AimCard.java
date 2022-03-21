package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class AimCard extends ActionCard {
    private String name;

    public AimCard(){
        name = "Aim card";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void action(GameTable table) {
        int targetedPlace = ZKlavesnice.readInt("Choose place you want to put card Aim on");
        targetedPlace = this.verifyAimInput(table, targetedPlace);
        table.getBoard().aimPlaces[targetedPlace - 1] = "Aimed at";
    }

    @Override
    public boolean canBePlayed(GameTable table) {
        if(table.getBoard().isAllAimed()){
            return false;
        }
        return true;
    }
}
