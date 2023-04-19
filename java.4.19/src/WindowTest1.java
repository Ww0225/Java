/**
 * @author 28953
 * @create 2023-04-19 19:06
 */
class Windows implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    public synchronized void show(){
        if(ticket>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"：卖票，票号为："+ticket);
            ticket--;
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Windows w1 = new Windows();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.start();
        t2.start();
        t3.start();
    }
}
