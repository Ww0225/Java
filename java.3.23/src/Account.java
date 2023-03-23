public class Account {
    private int id;//账号
    private double balance;//余额
    private double annuallnterestRate;//年利率
    public Account(int id,double balance,double annuallnterestRate)
    {
        super();
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }
    //返回月利率
    public double getMonthlyInterest()
    {
        return annuallnterestRate / 12;
    }
    //取钱
    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            return;
        }
        else
        {
            System.out.println("余额不足");
        }
    }
    //存钱
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }
}
