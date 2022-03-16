package sk.stuba.fei.uim.oop;

public class Game {
    private Player[] players;


    public Game(){
        System.out.println("Welcom to duck my Duck hunt game! Hope you will like it <3");
        System.out.println("Now is time to choose players: ");
        Player[] players = new Player[3];
        for(int i =0; i < players.length; i++){
            players[i] = new Player();
        }
//        BalicekPreJazierko balicekJazierka = new BalicekPreJazierko();
//        balicekJazierka.naplnBalicek(players);

    }
}
