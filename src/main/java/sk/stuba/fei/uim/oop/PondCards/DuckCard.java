package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.Player;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class DuckCard extends PondCard {
    private String name = "Duck";
    private Player owner; // prerob ownera na objekt hraca ty jebek


   public DuckCard(Player player)
   {
       this.owner = player;

   }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Player player) {
        this.owner = player;
    }

    public Player getOwner() {
        return owner;
    }

    @Override
    public String printPondCard() {
        return (name + " of " + this.owner.getName());
    }

    @Override
    public void wasShot(GameTable table, int chosenPlace) {
        System.out.println("You shot duck of player" + this.owner.getName());
        this.owner.duckShot();
        table.getBoard().pondPlaces.remove(chosenPlace - 1);
        table.getBoard().aimPlaces[chosenPlace - 1] = "Not aimed at";
        table.getBoard().pondPlaces.add(table.getPondPackage().cardOnTop());
    }

    @Override
    public void turboDuckAction(GameTable table, int chosenSpot) {
        int verifiedSpot = this.verifyTurboDuck(chosenSpot);
        PondCard temporary = table.getBoard().pondPlaces.get(verifiedSpot - 1);
        table.getBoard().pondPlaces.remove(verifiedSpot - 1);
        table.getBoard().pondPlaces.add(0, temporary);

    }

    private int verifyTurboDuck(int chosenSpot){
       while ((chosenSpot < 1) || (chosenSpot > 6)){
           chosenSpot = ZKlavesnice.readInt("please insert number between 1-6");
       }
       return chosenSpot;
    }



}
