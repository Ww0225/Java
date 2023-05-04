/**
 * 编写程序，模拟银行账户功能。要求如下：
 *   属性：账号、姓名、存款余额、最小余额。
 *   方法：存款、取款、转账、查询。
 *   根据用户操作显示储户相关信息。
 * 如存款操作后，显示储户原有余额、今日存款数额及最终存款余额。
 * 取款时，若取款成功，显示信息提示；若最后余额小于最小余额，拒绝取款，并显示信息
 *
 * @author 28953
 * @create 2023-05-04 13:45
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = new Bank(1001,"张三",2000,0);
    }
}
class Bank{
    private int account;//账户
    private String name;//姓名
    private double balance;//存款余额
    private double minBalance;//最小余额
    public Bank() {
    }
    public Bank(int account, String name, double balance, double minBalance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }
    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getMinBalance() {
        return minBalance;
    }
    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
    public void deposit(int balance){//存款
        balance += balance;
    }
    public int withdrawal(int balance){//取款
        return balance -= balance;
    }
    public void transferAccount(){//转账

    }
}
