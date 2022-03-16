package sk.stuba.fei.uim.oop;

public class WaterCard extends PondCard {
    private String meno = "Water";
    //public int pozicia = 1;

    @Override
    public void printCardName() {
        System.out.println("this cards name is " + meno);
        //System.out.println("test ci ide aj pozicia vody keby som potreboval" + pozicia);
    }
}
