package AtmLLD;

public class BankAccount {
    private long bankAccountNumber;
    private long balance;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean updateBalance(long deductedBalance) {
        if (deductedBalance <= balance) {
            this.balance = balance - deductedBalance;
            System.out.println("Updated Balance is " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }
}
