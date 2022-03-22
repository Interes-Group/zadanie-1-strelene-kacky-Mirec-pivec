package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.ActionCards.ActionCard;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private Player[] players;
    private GameTable table;

    public Game(){
        this.prepareGame();
        this.round();
    }

    private void inicializePlayers(){
        int number = ZKlavesnice.readInt("please insert number of players");
        while ((number < 2) || (number > 6)){
            number = ZKlavesnice.readInt("insert number between 1-6, please try again");
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
            // nejako doriesit vymenu karty idealne cez metodu hraca zahodit + potiahnut novu.
        }

        int chosenCard = ZKlavesnice.readInt("Choose card you would like to play");

        while(!player.canPlayThis(player.getCards().get(chosenCard - 1), this.table)){
            chosenCard = ZKlavesnice.readInt("pick another you can't play that one");
        }

        player.useCard(chosenCard - 1, this.table);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        this.table.getBoard().printBoard();
        //pozriet sa ci ostal jediny zivy nejkou metodou
        //pokial hej tak iba ten kto prave zahral moze byt vitaz
    }
}
