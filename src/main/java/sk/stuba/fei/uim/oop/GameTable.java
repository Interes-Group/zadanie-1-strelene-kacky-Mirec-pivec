package sk.stuba.fei.uim.oop;

public class GameTable {
    private PondCardsPackage pondPackage = new PondCardsPackage();
    private Pond board = new Pond();


    public PondCardsPackage getPondPackage() {
        return pondPackage;
    }

    public Pond getBoard() {
        return board;
    }
}
