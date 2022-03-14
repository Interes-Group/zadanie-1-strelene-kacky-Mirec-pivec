package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Hrac {
    private String meno;
    private int zivoty;

    public Hrac(){
        meno = ZKlavesnice.readString("zadaj meno hraca");
        zivoty = 5;
    };
}
