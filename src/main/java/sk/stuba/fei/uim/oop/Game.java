package sk.stuba.fei.uim.oop;

import java.util.Collections;

public class Game {
    private Player[] players;
    private GameTable table;
    //private PondCardsPackage pondPackage = new PondCardsPackage();
    //private Pond board = new Pond();



    public Game(){
        this.table = new GameTable();
        System.out.println("Welcome to my Duck hunt game! Hope you will like it <3");
        System.out.println("Now it's time to choose players: ");
        this.players = new Player[3];
        for(int i =0; i < players.length; i++){
            players[i] = new Player();
        }
        System.out.println("len aby to tu zastalo");
        table.getPondPackage().generatePackage(players);
        Collections.shuffle(this.table.getPondPackage().getCardsPackage());
        table.getBoard().initializePondPlaces(this.table.getPondPackage());
        table.getBoard().printBoard();
        players[0].useCard(1,table);
        System.out.println("---------------------------------");
        table.getBoard().printBoard();







    }
}
