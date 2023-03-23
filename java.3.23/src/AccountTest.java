public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account(1122,20000,0.045);
        ac.withdraw(30000);
        System.out.println("余额:"+ac.getBalance());
        ac.withdraw(2500);
        ac.deposit(3000);
        System.out.println("余额:"+ac.getBalance());
        System.out.println("月利率:"+ac.getMonthlyInterest());
    }
}
