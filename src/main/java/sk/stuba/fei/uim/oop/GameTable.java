package sk.stuba.fei.uim.oop;

public class GameTable {
    private PondCardsPackage pondPackage;
    private Pond board;

    public GameTable(Player[] players){
        this.pondPackage = new PondCardsPackage(players);
        this.board = new Pond();
        this.board.initializePondPlaces(this.getPondPackage());
    }


    public PondCardsPackage getPondPackage() {
        return pondPackage;
    }

    public Pond getBoard() {
        return board;
    }
}
