package AtmLLD;

public class Card {
    private BankAccount bankAccount;
    private long cvv;
    private static int cardPin = 1234;
    private long expiryDate;

    public long getBalance() {
        return bankAccount.getBalance();
    }

    public boolean verifyPin(int pin) {
        if (cardPin == pin) {
            return true;
        }
        return false;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
