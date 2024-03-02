package liskob_substitution;

public class Main {
    public static void main(String[] args) {
        WithdrawableAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(100);
        currentAccount.withdraw(50);

        WithdrawableAccount savingAccount = new SavingAccount();
        savingAccount.deposit(50);
        savingAccount.withdraw(20);

        Account fixedDepositeAccount = new FixedDepositAccount();
        fixedDepositeAccount.deposit(200);
    }
}