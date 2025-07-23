package AtmLLD.CashWithdrawal;

import AtmLLD.ATM;

public class OneHundredCashWithdrawalProcessor extends CashWithdrawalProcessor {
    public OneHundredCashWithdrawalProcessor(CashWithdrawalProcessor nextCashWithdrawalProcessor) {
        super(nextCashWithdrawalProcessor);
    }

    public void withDraw(ATM atm, long requestedAmount) {
        long requiredNotes = requestedAmount / 100;
        long remainingBalance = requestedAmount % 100;
        if (requiredNotes <= atm.getFiveHundredNotes()) {
            atm.updateFiveHundredNotes(atm.getFiveHundredNotes() - requiredNotes);
        } else if (requiredNotes > atm.getFiveHundredNotes()) {
            atm.updateFiveHundredNotes(atm.getFiveHundredNotes());
            remainingBalance = remainingBalance + (requiredNotes - atm.getFiveHundredNotes()) * 100;
        }
        if (remainingBalance != 0) {
            System.out.println("Unable to process request");
        }
    }
}
