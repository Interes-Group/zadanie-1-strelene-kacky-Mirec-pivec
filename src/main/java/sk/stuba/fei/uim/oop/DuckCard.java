package sk.stuba.fei.uim.oop;

public class DuckCard extends PondCard {
    private String name = "Duck";
    private String owner;


   public DuckCard(Player player)
   {
       owner = player.getMeno();

   }


    @Override
    public void printCardName() {
        System.out.println("Cards name is " + name + ", its owners name is "+owner);
    }

}
