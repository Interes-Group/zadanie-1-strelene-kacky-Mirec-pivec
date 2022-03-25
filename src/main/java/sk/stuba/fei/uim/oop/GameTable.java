package sk.stuba.fei.uim.oop;

public class GameTable {
    private PondCardsPackage pondPackage;
    private Pond board;
    private ActionCardsPackage actionPackage;

    public GameTable(Player[] players){
        this.pondPackage = new PondCardsPackage(players);
        this.board = new Pond();
        this.board.initializePondPlaces(this.getPondPackage());
        this.actionPackage = new ActionCardsPackage();
    }

    public PondCardsPackage getPondPackage() {
        return this.pondPackage;
    }

    public Pond getBoard() {
        return this.board;
    }

    public ActionCardsPackage getActionPackage() {
        return this.actionPackage;
    }
}
