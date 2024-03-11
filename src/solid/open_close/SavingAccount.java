package solid.open_close;

public class SavingAccount implements Account{
    @Override
    public void deposit(int amount) {
        System.out.println("You have been debited: " + amount + " in your saving account");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("You have been credited: " + amount + " in your saving account");
    }
}
