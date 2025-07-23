package AtmLLD.AtmStates;

import AtmLLD.ATM;
import AtmLLD.Card;
import AtmLLD.CashWithdrawal.CashWithdrawalProcessor;
import AtmLLD.CashWithdrawal.FiveHundredCashWithdrawalProcessor;
import AtmLLD.CashWithdrawal.OneHundredCashWithdrawalProcessor;
import AtmLLD.CashWithdrawal.TwoThousandCashWithdrawalProcessor;

public class CashWithdrawalState extends AtmState {
    @Override
    public void cashWithdrawal(ATM atm, Card card, long amount) {
        if (atm.getBalance() < amount) {
            System.out.println("ATM has insufficient funds");
            exit(atm);
        } else if (card.getBalance() < amount) {
            System.out.println("Bank account has insufficient funds");
            exit(atm);
        } else {
            CashWithdrawalProcessor cashWithdrawalProcessor =
                    new TwoThousandCashWithdrawalProcessor(new FiveHundredCashWithdrawalProcessor
                            (new OneHundredCashWithdrawalProcessor(null)));
            cashWithdrawalProcessor.withDraw(atm, amount);
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
