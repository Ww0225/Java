package Bank;

public class Account {
    private int id;//账号
    private double balance;//余额
    private double annuallnteresRate;//年利率
    public void Account()
    {
    }
    public void Account(int id,double balance,double annuallnteresRate)
    {
        this.id = id;
        this.balance = balance;
        this.annuallnteresRate = annuallnteresRate;
    }

    public void withdraw(double amount)//取钱
    {
        if(balance < amount)
        {
            System.out.println("余额不足，取款失败");
        }
        else
        {
            balance -= amount;
        }
        System.out.println("成功取出:" + amount);
    }
    public void deposit(double amount)//存钱
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println("成功存入:" + amount );
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAnnuallnteresRate(double annuallnteresRate) {
        this.annuallnteresRate = annuallnteresRate;
    }

    public double getAnnuallnteresRate() {
        return annuallnteresRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
