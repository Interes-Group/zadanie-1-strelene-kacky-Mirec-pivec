package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Hra {

    public Hra(){
        Hrac[] hraci = new Hrac[5];
        for(int i =0; i < 5; i++){
            hraci[i] = new Hrac();
            hraci[i].vypisHraca();
        }
        Karta test = new Kacka();
    }
}
