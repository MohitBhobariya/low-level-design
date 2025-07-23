package AtmLLD.AtmStates;

import AtmLLD.ATM;
import AtmLLD.Card;
import AtmLLD.TransactionType;

public class SelectOperation extends AtmState {
    public SelectOperation() {
        showAllOperations();
    }

    private void showAllOperations() {
        TransactionType.showAllTransactionTypes();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        if (transactionType == TransactionType.CASH_WITHDRAWAL) {
            atm.setAtmState(new CashWithdrawalState());
        } else if (transactionType == TransactionType.BALANCE_CHECK) {
            atm.setAtmState(new CheckBalanceState());
        } else {
            System.out.println("Invalid operation selected");
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
