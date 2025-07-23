package AtmLLD.AtmStates;

import AtmLLD.ATM;
import AtmLLD.Card;
import AtmLLD.TransactionType;

public abstract class AtmState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS!  Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("OOPS!  Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("OOPS!  Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, long amount) {
        System.out.println("OOPS!  Something went wrong");
    }

    public void checkBalance(ATM atm, Card card) {
        System.out.println("OOPS!  Something went wrong");
    }

    public void returnCard() {
        System.out.println("OOPS!  Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("OOPS!  Something went wrong");
    }
}
