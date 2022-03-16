package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.PondCards.PondCardsPackage;

import java.util.Collections;

public class Game {
    private Player[] players;
    private PondCardsPackage pondPackage = new PondCardsPackage();
    private BoardTable board = new BoardTable();



    public Game(){
        System.out.println("Welcome to my Duck hunt game! Hope you will like it <3");
        System.out.println("Now it's time to choose players: ");
        this.players = new Player[3];
        for(int i =0; i < players.length; i++){
            players[i] = new Player();
        }
        System.out.println("len aby to tu zastalo");
        pondPackage.generatePackage(players);
        Collections.shuffle(this.pondPackage.getCardsPackage());
        board.initializePondPlaces(pondPackage);
        board.printBoard();







    }
}
