package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.Collections;

public class Game {
    private Player[] players;
    private GameTable table;



    public Game(){
        System.out.println("len nech to tu zastane");
        this.prepareGame();
        this.round();
        //table.getPondPackage().generatePackage(players);
        //Collections.shuffle(this.table.getPondPackage().getCardsPackage());
        //table.getBoard().initializePondPlaces(this.table.getPondPackage());
        //this.table.getBoard().printBoard();
        //players[0].useCard(1,table);

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
        //najprv nainicializovat action karty
        //potom hracov ale mozno bez kariet
        //potom hraciu plochu aj s Pond kartami alebo najprv hracov bez kariet potom hraciu plochu
        //a potom hracom dodat karty

        System.out.println("Welcome to my Duck hunt game! Hope you will like it <3");
        System.out.println("Now it's time to choose players: ");

        this.inicializePlayers();
        this.table = new GameTable(this.players);
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

        if (player.hasNothingToPlay(this.table)){
            System.out.println(player.getName() + "has nothing to play, throw card and take another");
            //len kontrola ci to aspon pojde
        }
        int chosenCard = ZKlavesnice.readInt("Choose card you would like to play");
        while(player.canPlayThis(player.getCards().get(chosenCard), this.table)){
            //zatial takto mozno to vysperkujem este
            chosenCard = ZKlavesnice.readInt("pick another you can't play that one");
        }
        player.useCard(chosenCard, this.table);
        //este doriesit remove vylozenej a potiahnutie dalsej ale aj tak este nemam actionCardPackage takze...

        System.out.println("---------------------------------");
        this.table.getBoard().printBoard();
    }
}
