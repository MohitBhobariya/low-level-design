package AtmLLD.CashWithdrawal;

import AtmLLD.ATM;

public class TwoThousandCashWithdrawalProcessor extends CashWithdrawalProcessor {

    public TwoThousandCashWithdrawalProcessor(CashWithdrawalProcessor nextCashWithdrawalProcessor) {
        super(nextCashWithdrawalProcessor);
    }

    public void withDraw(ATM atm, long requestedAmount) {
        long requiredNotes = requestedAmount / 2000;
        long remainingBalance = requestedAmount % 2000;
        if (requiredNotes <= atm.getTwoThousandNotes()) {
            atm.updateTwoThousandNotes(atm.getTwoThousandNotes() - requiredNotes);
        } else if (requiredNotes > atm.getTwoThousandNotes()) {
            atm.updateTwoThousandNotes(atm.getTwoThousandNotes());
            remainingBalance = remainingBalance + (requiredNotes - atm.getTwoThousandNotes()) * 2000;
        }
        if (remainingBalance != 0) {
            super.withDraw(atm, remainingBalance);
        }
    }
}
