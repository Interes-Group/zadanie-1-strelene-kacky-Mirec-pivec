package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.PondCards.PondCard;

import java.util.ArrayList;

public class Pond {
    // asi dat obidve private
    public ArrayList<PondCard> pondPlaces;
    public String[] aimPlaces;

    public Pond(){
        this.pondPlaces = new ArrayList<>();
        this.aimPlaces = new String[]{"Not aimed at", "Not aimed at", "Not aimed at",
                "Not aimed at", "Not aimed at", "Not aimed at"};
    }


    public void initializePondPlaces(PondCardsPackage pondPackage){
        for (int counter = 0; counter < 6; counter++) {
            this.pondPlaces.add(pondPackage.getCardsPackage().get(0));
            pondPackage.getCardsPackage().remove(0);
        }
    }

    public void printBoard(){
        for (int place = 0; place < aimPlaces.length; place++) {
            System.out.println((place + 1) + ". " + this.aimPlaces[place] + " - " + this.pondPlaces.get(place).printPondCard());
        }
    }

    public boolean isAllAimed(){
        for (int place = 0; place < this.aimPlaces.length; place++) {
            if (this.aimPlaces[place].equals("Not aimed at")){
                return false;
            }
        }
        return true;
    }

}
