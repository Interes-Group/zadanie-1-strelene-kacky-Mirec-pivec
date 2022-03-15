package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Hrac {
    private String meno;
    private int zivoty;

    public Hrac(){
        meno = ZKlavesnice.readString("zadaj meno hraca");
        zivoty = 5;
    }

    public Hrac generujHraca(){
        return new Hrac();
    }

    public void vypisHraca(){
        System.out.println("hrac sa vola" + meno);
        System.out.println("ma pocet zivotov " + zivoty);
    }

    public String getMeno() {
        return meno;
    }
}
