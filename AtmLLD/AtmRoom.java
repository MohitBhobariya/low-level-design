package AtmLLD;

public class AtmRoom {
    private ATM atm;
    private User user;

    public static void main(String[] args) {
        AtmRoom atmRoom = new AtmRoom();
        atmRoom.initialize();
        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getAtmState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), 12355);
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getAtmState().cashWithdrawal(atmRoom.atm, atmRoom.user.getCard(), 2700);
        atmRoom.atm.printCurrentATMStatus();

    }

    private void initialize() {
        atm = ATM.getAtmObject();
        atm.setAtmBalance(5000, 3, 2, 4);
        user = createUser();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private BankAccount createBankAccount() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(3000);
        return bankAccount;

    }
}
