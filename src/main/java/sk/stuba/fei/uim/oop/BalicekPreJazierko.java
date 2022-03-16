package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class BalicekPreJazierko {
    private ArrayList<PondCard> balicek = new ArrayList<>();

    BalicekPreJazierko(){

    }

    public void naplnBalicek(Player[] hraci){
        for (int i = 0; i < hraci.length; i++){
            for(int j =0; j < 5; j++) {
                PondCard hracovaKacka = new Kacka(hraci[i]);
                balicek.add(hracovaKacka);
            }
            PondCard voda = new WaterCard();
            balicek.add(voda);
        }
    }
}
