package abstract_package;

public class SaveAccount extends Account {

    SaveAccount(int accountNo, double balance, String name) {
        super(accountNo, balance, name);
    }

    @Override
    public void withdraw(double account) {

    }

    @Override
    public void deposit(double account) {

    }
}
