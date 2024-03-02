package open_close;

public class Main {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount();
        currentAccount.deposit(100);
        currentAccount.withdraw(50);

        Account savingAccount = new SavingAccount();
        savingAccount.deposit(50);
        savingAccount.withdraw(20);

        /*Account fixedDepositeAccount = new FixedDepositAccount();
        fixedDepositeAccount.deposit(200);
        fixedDepositeAccount.withdraw(80);*/
    }
}