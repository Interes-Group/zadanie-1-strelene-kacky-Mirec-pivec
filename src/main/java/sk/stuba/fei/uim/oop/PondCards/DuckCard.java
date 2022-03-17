package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.Player;

public class DuckCard extends PondCard {
    private String name = "Duck";
    private String owner;


   public DuckCard(Player player)
   {
       owner = player.getName();

   }

    public String getOwner() {
        return owner;
    }

    @Override
    public String printPondCard() {
        return (name + " of " + this.owner);
    }

}
