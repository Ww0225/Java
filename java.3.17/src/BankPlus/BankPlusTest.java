package BankPlus;

public class BankPlusTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        bank.getCustomer(0).getAccount().getBalance();
        }
}
