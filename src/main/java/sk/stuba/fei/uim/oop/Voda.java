package sk.stuba.fei.uim.oop;

public class Voda extends Karta {
    private String meno = "Voda";

    @Override
    public void vypisMenoKarty() {
        System.out.println("Tato karta sa vola " + meno);
    }
}
