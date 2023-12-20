package abstract_package;

public class testAccount {
    public static void main(String[] args) {
        Account cAccount = new ChickingAccount(123, 500,"abc");
        Account sAccount =new SaveAccount(211,1124,"khdg");
        cAccount.deposit(65);
        sAccount.withdraw(21);
    }
}


