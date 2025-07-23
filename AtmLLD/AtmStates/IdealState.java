package AtmLLD.AtmStates;

import AtmLLD.ATM;
import AtmLLD.Card;

public class IdealState extends AtmState{

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Please insert your card");
        atm.setAtmState(new HasCard());
    }
}
