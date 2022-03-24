package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.ActionCards.ActionCard;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private Player[] players;
    private GameTable table;
    private Player winner;

    public Game(){
        this.prepareGame();
        while(this.winner == null) {
            this.round();
        }
        System.out.println("Winner is: " + this.winner.getName() + "!!!");
        System.out.println("COUNGRATULATION");
    }

    private void inicializePlayers(){
        int number = ZKlavesnice.readInt("please insert number of players");
        while ((number < 2) || (number > 6)){
            number = ZKlavesnice.readInt("insert number between 2-6, please try again");
        }
        this.players = new Player[number];
        for(int i =0; i < this.players.length; i++){
            this.players[i] = new Player();
        }
    }

    private void prepareGame(){
        System.out.println("Welcome to my Duck hunt game! Hope you will like it <3");
        System.out.println("Now it's time to choose players: ");

        this.inicializePlayers();
        this.table = new GameTable(this.players);

        for (int playerIndex = 0; playerIndex < this.players.length; playerIndex++) {
            this.players[playerIndex].generateCards(this.table.getActionPackage());
        }

        this.table.getBoard().printBoard();

    }

    private void round(){
        for (int playerNumber = 0; playerNumber < this.players.length; playerNumber++) {
            this.playerTurn(this.players[playerNumber]);
        }
    }

    private int numOfAlivePlayers(Player[] players){
        int counter = 0;
        for (int index = 0; index < players.length; index++) {
            if (!players[index].isDead()){
                counter++;
            }
        }
        return counter;
    }

    private void getWinner(Player[] players){
        for (int playerNum = 0; playerNum < players.length; playerNum++){
            if (!players[playerNum].isDead()){
                this.winner = players[playerNum];
                return;
            }
        }
    }

    private void playerTurn(Player player){
        if (player.isDead()){
            return;
        }
        System.out.println("----------------------------------------");
        System.out.println(player.getName() + " is on turn");
        System.out.println("----------------------------------------");
        System.out.println(player.getName() + " has cards: ");
        player.printCards(player.getCards());

        if (player.hasNothingToPlay(this.table)){
            System.out.println(player.getName() + "has nothing to play, throw card and take another");
            player.skipRound(this.table);
            System.out.println("Turn of player "+ player.getName() + "was skipped");
            this.table.getBoard().printBoard();
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
            return;
        }

        int chosenCard = ZKlavesnice.readInt("Choose card you would like to play");

        while((chosenCard < 1) || (chosenCard > 3) || (!player.canPlayThis(player.getCards().get(chosenCard - 1), this.table))){
            chosenCard = ZKlavesnice.readInt("pick another you can't play that one");
        }

        player.useCard(chosenCard - 1, this.table);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        this.table.getBoard().printBoard();

        int checkWinner = this.numOfAlivePlayers(this.players);
        if (checkWinner == 1){
            getWinner(this.players);
        }
    }
}
//skuska pre push commit