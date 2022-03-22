package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.ActionCards.*;

import java.util.ArrayList;
import java.util.Collections;

public class ActionCardsPackage {
    private ArrayList<ActionCard> cardsPackage;

    public ActionCardsPackage(){
        this.cardsPackage = new ArrayList<>();

        for (int number = 0; number < 10; number++) {
            ActionCard card = new AimCard();
            this.cardsPackage.add(card);
        }

        for (int number = 0; number < 12; number++) {
            ActionCard shoot = new ShootCard();
            this.cardsPackage.add(shoot);
        }

        for (int number = 0; number < 2; number++) {
            ActionCard wildBill = new WildBillCard();
            this.cardsPackage.add(wildBill);
        }
        for (int number = 0; number < 6; number++) {
            ActionCard ducMarch = new DuckMarchCard();
            this.cardsPackage.add(ducMarch);
        }

        for (int number = 0; number < 2; number++) {
            ActionCard scatter = new Scatter();
            this.cardsPackage.add(scatter);
        }
        ActionCard turboDuck = new TurboDuck();
        this.cardsPackage.add(turboDuck);

        ActionCard duckDance = new DuckDanceCard();
        this.cardsPackage.add(duckDance);

        Collections.shuffle(this.cardsPackage);
    }

    public ArrayList<ActionCard> getCardsPackage() {
        return cardsPackage;
    }
}
