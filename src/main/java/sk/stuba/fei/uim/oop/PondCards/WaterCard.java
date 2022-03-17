package sk.stuba.fei.uim.oop.PondCards;

public class WaterCard extends PondCard {
    private String name = "Water";
    //public int pozicia = 1;


    public String getName() {
        return name;
    }

    @Override
    public String printPondCard() {
        return getName();
    }
}
