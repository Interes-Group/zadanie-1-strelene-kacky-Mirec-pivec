package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.PondCards.PondCard;

public class DuckMarchCard extends ActionCard {
    private String name = "Duck march card";

    @Override
    public void action(BoardTable board) {
        for (int pondPlaceIndex = 5; pondPlaceIndex > 0; pondPlaceIndex--) {
            PondCard tmp = board.pondPlaces.get(pondPlaceIndex - 1);
            board.pondPlaces.set(pondPlaceIndex - 1, board.pondPlaces.get(5));
            board.pondPlaces.set(5, tmp);
        }
    }


    @Override
    public boolean canBePlayed(BoardTable board) {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
