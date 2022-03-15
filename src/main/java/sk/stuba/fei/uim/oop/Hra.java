package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Hra {

    public Hra(){
        Hrac[] hraci = new Hrac[5];
        for(int i =0; i < 5; i++){
            hraci[i] = new Hrac();
            hraci[i].vypisHraca();
        }
        Karta[] test = new Karta[2];
        test[0] = new Kacka();
        test[1] = new Voda();

        for (int i = 0; i < test.length; i++){
            test[i].vypisMenoKarty();
        }
    }
}
