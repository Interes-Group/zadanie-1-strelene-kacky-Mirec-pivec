package sk.stuba.fei.uim.oop;

public class Kacka extends Karta {
    private String meno = "Kacka";
//    private String vlastnik;
//
//    public Kacka(Hrac hrac){
//        vlastnik = hrac.getMeno();
//    }


    @Override
    public void vypisMenoKarty() {
        System.out.println(meno);
    }
}
