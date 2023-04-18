/**
 * @author 28953
 * @create 2023-04-18 21:05
 */
public class WindowsTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.start();
        t2.start();
        t3.start();
    }
}
class Window implements Runnable{
    public int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while(true)
        {

            synchronized(obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
