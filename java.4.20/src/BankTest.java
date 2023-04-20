/**
 * @author 28953
 * @create 2023-04-20 8:20
 */
public class BankTest {

}
class Bank{
    private Bank(){}
    private static Bank instance = null;
    public static Bank getInstance() {
        //方式一：效率低
        //synchronized (Bank.class)
        /*if(instance == null){
            instance = new Bank();
        }
        return instance;*/
        //方式二:效率高
        if(instance == null){
            synchronized(Bank.class){
                if(instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}


