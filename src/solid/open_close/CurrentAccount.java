package solid.open_close;

public class CurrentAccount implements Account{
    @Override
    public void deposit(int amount) {
        System.out.println("You have been debited: " + amount + " in your current account");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("You have been credited: " + amount + " in your current account");
    }
}
