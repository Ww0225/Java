import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三
 * @author 28953
 * @create 2023-04-23 10:48
 */
public class LockTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Window implements Runnable{
    private  int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true)
        {
            try {
                lock.lock();
                if(ticket>0){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":卖票，票号为:"+ticket);
                    ticket--;
                }else
                    break;
            }finally {
                lock.unlock();
            }
        }
    }
}
