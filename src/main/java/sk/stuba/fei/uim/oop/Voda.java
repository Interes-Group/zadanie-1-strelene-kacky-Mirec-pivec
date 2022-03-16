package sk.stuba.fei.uim.oop;

public class Voda extends KartaJazera {
    private String meno = "Voda";
    //public int pozicia = 1;

    @Override
    public void vypisMenoKarty() {
        System.out.println("Tato karta sa vola " + meno);
        //System.out.println("test ci ide aj pozicia vody keby som potreboval" + pozicia);
    }
}
