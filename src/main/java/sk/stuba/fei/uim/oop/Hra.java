package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Hra {
    private Hrac[] players;


    public Hra(){
        System.out.println("Welcom to duck my Duck hunt game! Hope you will like it <3");
        System.out.println("Now is time to choose players: ");
        Hrac[] hraci = new Hrac[3];
        for(int i =0; i < hraci.length; i++){
            hraci[i] = new Hrac();
        }
        BalicekPreJazierko balicekJazierka = new BalicekPreJazierko();
        balicekJazierka.naplnBalicek(hraci);

    }
}
