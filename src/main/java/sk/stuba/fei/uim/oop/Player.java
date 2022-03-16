package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Player {
    private String meno;
    private int zivoty;

    public Player(){
        meno = ZKlavesnice.readString("zadaj meno hraca");
        zivoty = 5;
    }

    public Player generujHraca(){
        return new Player();
    }

    public void vypisHraca(){
        System.out.println("hrac sa vola" + meno);
        System.out.println("ma pocet zivotov " + zivoty);
    }

    public String getMeno() {
        return meno;
    }
}
