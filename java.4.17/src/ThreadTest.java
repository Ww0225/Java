/**
 * @author 28953
 * @create 2023-04-17 16:39
 */
class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
        Thread t2 = new Thread(myThread);
        t2.start();
    }
}
