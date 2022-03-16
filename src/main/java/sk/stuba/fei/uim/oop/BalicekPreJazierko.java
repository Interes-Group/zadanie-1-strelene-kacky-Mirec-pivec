package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class BalicekPreJazierko {
    private ArrayList<KartaJazera> balicek = new ArrayList<>();

    BalicekPreJazierko(){

    }

    public void naplnBalicek(Hrac[] hraci){
        for (int i = 0; i < hraci.length; i++){
            for(int j =0; j < 5; j++) {
                KartaJazera hracovaKacka = new Kacka(hraci[i]);
                balicek.add(hracovaKacka);
            }
            KartaJazera voda = new Voda();
            balicek.add(voda);
        }
    }
}
