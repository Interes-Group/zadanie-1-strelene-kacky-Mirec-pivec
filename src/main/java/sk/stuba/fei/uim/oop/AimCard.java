package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class AimCard extends ActionCard{
    private String name;

    public AimCard(){
        name = "Aim card";
    }

    @Override
    public void action(BoardTable board) {
        int targetedPlace = ZKlavesnice.readInt("Choose place you want to put card Aim on");
        board.aimPlaces[targetedPlace - 1] = "Aimed at";
    }
}
