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
        BankAccount account1 = new BankAccount(1001,"张三",2000,0);
        BankAccount account2 = new BankAccount(1002,"李四",5000,0);
        account1.deposit(2000);
        account2.withdraw(200);
        account1.transferAccount(account2,3000);
        account2.inquiry();
        account1.inquiry();
    }
}
class BankAccount{
    private int account;//账户
    private String name;//姓名
    private double balance;//存款余额
    private double minBalance;//最小余额
    public BankAccount() {
    }
    public BankAccount(int account, String name, double balance, double minBalance) {
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
    public void deposit(double amount){//存款
        double oldBalance = balance;
        balance += amount;
        System.out.println("原有余额:"+oldBalance+",存款余额:"+amount+",最终余额:"+balance);
    }
    public boolean withdraw(double amount){//取款
        if(amount<balance){
            balance-=amount;
            System.out.println("取款成功，取款金额为:"+amount+",余额为:"+balance);
            return true;
        }else{
            System.out.println("取款失败，余额不足"+amount);
            return false;
        }
    }
    public void transferAccount(BankAccount account,double amount){//转账
        if(this.withdraw(amount)){
            account.deposit(amount);
            System.out.println("转账成功，收款方为:"+account.name+"，转账金额为:"+amount);
        }else{
            System.out.println("转账失败，余额不足");
        }
    }
    public void inquiry(){
        System.out.println("账户信息:"+account+"\n姓名:"+name+"\n余额:"+balance);
    }
}
