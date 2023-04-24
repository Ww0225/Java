/**
 * 线程通信的例子，使用两个线程打印 1-100，线程一，线程二 交替打印
 *
 * 涉及的三个方法：
 * wait(); 一旦执行此方法，当前线程进入阻塞状态，并释放同步监视器
 * notify(); 一旦执行此方法，就会唤醒被wait的一个线程，如果有多个线程被wait，就唤醒优先级高的那个
 * notifyAll(); 一旦执行此方法，就会唤醒所有被wait的一个线程
 * 注意：1.此三个方法必须使用在同步代码块或同步方法中
 *
 * 面试题: sleep() 和 wait()的异同？
 * 1.相同点：一旦执行方法，都可以使得当前的线程进入阻塞状态
 * 2.不同点：①两个方法声明的位置不同：Thread类中声明sleep(),Object类中声明wait()
 *           ②调用的要求不同：sleep()可以在任何需要的场景下调用，wait()必须使用在同步代码块或同步方法中
 *           ③关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会
 * @author 28953
 * @create 2023-04-24 21:36
 */
public class Demo10 {
    public static void main(String[] args) {
        MyThread10 myThread1 = new MyThread10();
        Thread t1 = new Thread(myThread1);
        Thread t2 = new Thread(myThread1);
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }
}
class MyThread10 implements Runnable{
    private int num = 1;
    @Override
    public void run() {
        while(true){
            synchronized(this){
                notify();
                if(num<=100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+num);
                    num++;
                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
