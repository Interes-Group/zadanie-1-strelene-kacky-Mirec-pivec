package sk.stuba.fei.uim.oop;

import java.util.Collections;

public class Scatter extends ActionCard{
    private String name = "Scatter card";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean canBePlayed(BoardTable board) {
        return true;
    }

    @Override
    public void action(BoardTable board) {
        Collections.shuffle(board.pondPlaces);
    }
}
