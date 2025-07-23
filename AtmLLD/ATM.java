package AtmLLD;

import AtmLLD.AtmStates.AtmState;
import AtmLLD.AtmStates.IdealState;

public class ATM {
    private long balance;
    private long twoThousandNotes;
    private long fiveHundredNotes;
    private long oneHundredNotes;
    static ATM atm = new ATM();
    private AtmState atmState;

    public ATM() {
    }

    public ATM(long balance, long twoThousandNotes, long fiveHundredNotes, long oneHundredNotes) {
        this.balance = balance;
        this.twoThousandNotes = twoThousandNotes;
        this.fiveHundredNotes = fiveHundredNotes;
        this.oneHundredNotes = oneHundredNotes;
    }

    public static ATM getAtmObject() {
        atm.setAtmState(new IdealState());
        return atm;
    }

    public long getBalance() {
        return balance;
    }

    public long getTwoThousandNotes() {
        return twoThousandNotes;
    }

    public long getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public long getOneHundredNotes() {
        return oneHundredNotes;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

    public void printCurrentATMStatus() {
        System.out.println("Balance: " + balance);
        System.out.println("2kNotes: " + twoThousandNotes);
        System.out.println("500Notes: " + fiveHundredNotes);
        System.out.println("100Notes: " + oneHundredNotes);

    }

    public void updateTwoThousandNotes(long count) {
        this.twoThousandNotes = this.twoThousandNotes - count;
    }

    public void updateFiveHundredNotes(long count) {
        this.fiveHundredNotes = this.fiveHundredNotes - count;
    }

    public void updateOneHundredNotes(long count) {
        this.oneHundredNotes = this.oneHundredNotes - count;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.balance = atmBalance;
        this.twoThousandNotes = noOfTwoThousandNotes;
        this.fiveHundredNotes = noOfFiveHundredNotes;
        this.oneHundredNotes = noOfOneHundredNotes;
    }

    public AtmState getAtmState() {
        return atmState;
    }
}
