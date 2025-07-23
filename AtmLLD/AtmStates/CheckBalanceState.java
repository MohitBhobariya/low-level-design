package AtmLLD.AtmStates;

import AtmLLD.ATM;
import AtmLLD.Card;

public class CheckBalanceState extends AtmState {

    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Your Balance is " + card.getBalance());
        exit(atm);
    }

    @Override
    public void returnCard() {
        System.out.println("Please Collect Your Card");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdealState());
        System.out.println("Exit Successful");
    }
}
