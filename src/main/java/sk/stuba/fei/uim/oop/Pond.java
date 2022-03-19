package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.PondCards.PondCard;

import java.util.ArrayList;

//neinicializovať takto priamo
public class Pond {
    public ArrayList<PondCard> pondPlaces = new ArrayList<>();
    public String[] aimPlaces = {"Not aimed at", "Not aimed at", "Not aimed at",
            "Not aimed at", "Not aimed at", "Not aimed at"};

    public Pond(){

    }


    public void initializePondPlaces(PondCardsPackage pondPackage){
        for (int counter = 0; counter < 6; counter++) {
            pondPlaces.add(pondPackage.getCardsPackage().get(0));
            pondPackage.getCardsPackage().remove(0);
        }
    }

    public void printBoard(){
        for (int place = 0; place < aimPlaces.length; place++) {
            System.out.println((place + 1) + ". " + aimPlaces[place] + " - " + pondPlaces.get(place).printPondCard());
        }
    }

    public boolean isAllAimed(){
        for (int place = 0; place < aimPlaces.length; place++) {
            if (aimPlaces[place].equals("Not aimed at")){
                return false;
            }
        }
        return true;
    }
}