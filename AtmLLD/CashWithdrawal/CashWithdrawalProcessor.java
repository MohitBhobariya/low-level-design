package AtmLLD.CashWithdrawal;

import AtmLLD.ATM;

public abstract class CashWithdrawalProcessor {
    private CashWithdrawalProcessor nextCashWithdrawalProcessor;

    public CashWithdrawalProcessor(CashWithdrawalProcessor nextCashWithdrawalProcessor) {
        this.nextCashWithdrawalProcessor = nextCashWithdrawalProcessor;
    }

    public void withDraw(ATM atm, long requestedAmount) {
        if (nextCashWithdrawalProcessor != null) {
            nextCashWithdrawalProcessor.withDraw(atm, requestedAmount);
        }
    }
}
