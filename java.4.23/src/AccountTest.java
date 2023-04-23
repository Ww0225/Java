/**
 * 1.是否是多线程问题？是，两个储户线程
 * 2.是否有共享数据？有，账号（或账户余额）
 * 3.是否有线程安全问题？有
 * 4.需要考虑如何解决线程安全问题？同步机制：有三种方式
 * @author 28953
 * @create 2023-04-23 18:24
 */
class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    //存钱
    public synchronized void deposit(double amt){
        if(amt>0){
            balance+=amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":存钱成功，余额为:"+balance);
        }
    }
}
class Customer extends Thread{
    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }
    public void run(){
        for(int i=0;i<3;i++){
            acct.deposit(1000);
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);
        c1.setName("甲");
        c2.setName("乙");
        c1.start();
        c2.start();
    }
}
