package sk.stuba.fei.uim.oop;

public class Kacka extends KartaJazera {
    private String meno = "Kacka";
    private String vlastnik;


   public Kacka(Hrac hrac){
       vlastnik = hrac.getMeno();
   }


    @Override
    public void vypisMenoKarty() {
        System.out.println("Tato karta sa vola " + meno + ", jej vlastnik je hrac s menom "+vlastnik);
    }

}
