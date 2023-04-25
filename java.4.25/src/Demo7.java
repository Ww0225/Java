/**
 * @author 28953
 * @create 2023-04-25 19:58
 */
public class Demo7 {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        Thread t1 = new Thread(saleTicket,"窗口1");
        Thread t2 = new Thread(saleTicket,"窗口2");
        Thread t3 = new Thread(saleTicket,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class SaleTicket implements Runnable{
    int num = 50;//票数
    public void run(){
        while(true){
            synchronized ("锁"){
                if(num>0){
                    System.out.println(Thread.currentThread().getName()+"售出了第"+num+"号票");
                    num--;
                }else{
                    System.out.println("售罄了..");
                    break;
                }
            }
        }
    }
}
