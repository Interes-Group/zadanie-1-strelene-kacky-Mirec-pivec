package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class PripravaHracov {

    public ArrayList<Hrac> vygenerujHracov(){
        ArrayList<Hrac> Hraci = new ArrayList<Hrac>();
        for(int i = 0; i < 5;i++ ){
            Hraci.add(new Hrac());

        }
        return Hraci;
    }

}


