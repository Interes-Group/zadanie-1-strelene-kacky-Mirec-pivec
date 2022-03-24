package sk.stuba.fei.uim.oop.ActionCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class WildBillCard extends ShootCard {
    private String name;

    public WildBillCard(){
        this.name = "Wild Bill card";
    }

    @Override
    public void action(GameTable table) {
        super.action(table);
    }

    public String getName() {
        return this.name;
    }

    public boolean canBePlayed(GameTable table) {
        return true;
    }

    @Override
    protected int idk(GameTable table){
        return super.verifyOthers();
    }
}
