package bankpackage;

public class testBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.balance =5000;
        bankAccount1.accountNumber=123;
        bankAccount1.phoneNumber= "366556353653";
        bankAccount1.name="jamel";
        bankAccount1.deposit(5000);
        System.out.println(bankAccount1.balance);
        bankAccount1.withdraw(1000);
        System.out.println(bankAccount1.balance);
    }
}
