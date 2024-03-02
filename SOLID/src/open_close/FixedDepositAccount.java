package open_close;

public class FixedDepositAccount implements Account{
    @Override
    public void deposit(int amount) {
        System.out.println("You have been debited: " + amount + " in your fixed deposit account");
    }

    @Override
    public void withdraw(int amount) {
        // Need to implement Liskob Substitution Principle (LSP)
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedDepositAccount!!");
    }
}
