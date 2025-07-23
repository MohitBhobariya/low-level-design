package AtmLLD.AtmStates;

import AtmLLD.ATM;
import AtmLLD.Card;

public class HasCard extends AtmState {
    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isPinVerified = card.verifyPin(pin);
        if (isPinVerified) {
            System.out.println("Pin verified");
            atm.setAtmState(new SelectOperation());
        } else {
            System.out.println("Entered Pin is not correct!");
            exit(atm);
        }

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
