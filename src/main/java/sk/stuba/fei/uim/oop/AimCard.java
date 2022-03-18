package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class AimCard extends ActionCard{
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
        while ((targetedPlace < 1)  || (targetedPlace > 6)){
            targetedPlace = ZKlavesnice.readInt("You have to choose from places between 1 to 6, please choose again");
            //premenit to na metodu

        }
        while (table.getBoard().aimPlaces[targetedPlace - 1].equals("Aimed at")) {
            targetedPlace = ZKlavesnice.readInt("You chose already aimed spot, please enter spot which is not already aimed");
        }
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
