package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.Player;

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
    public void wasShot() {
        System.out.println("You shot duck of player" + this.owner.getName());
        this.owner.duckShot();
        //teraz este dajako vyriesit posun kariet
    }

    @Override
    public void turboDuckAction(GameTable table, int chosenSpot) {
        PondCard temporary = table.getBoard().pondPlaces.get(chosenSpot);
        table.getBoard().pondPlaces.remove(chosenSpot);
        table.getBoard().pondPlaces.add(0, temporary);
    }


}
