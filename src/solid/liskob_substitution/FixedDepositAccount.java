package solid.liskob_substitution;

public class FixedDepositAccount extends Account {
    @Override
    public void deposit(int amount) {
        System.out.println("You have been debited: " + amount + " in your fixed deposit account");
    }
}
