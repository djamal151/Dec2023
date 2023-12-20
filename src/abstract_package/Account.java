package abstract_package;

public abstract class Account {
    private int accountNo;
    private double balance;
    private String name;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Account(int accountNo, double balance, String name){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        


    }
    public abstract void withdraw(double account);
     public abstract void deposit(double account);
}
