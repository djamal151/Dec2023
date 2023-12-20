package abstract_package;

public  class ChickingAccount extends Account {


    ChickingAccount(int accountNo, double balance, String name) {
        super(accountNo, balance, name);
    }

    @Override
    public void withdraw(double account) {
        System.out.println("Withdrawing"+ "from chicking  account");
    }

    public void deposit(double amount) {
        System.out.println("Withdrawing"+ amount + "in checking account");
    }
}
