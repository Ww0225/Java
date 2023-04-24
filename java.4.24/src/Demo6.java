/**
 * @author 28953
 * @create 2023-04-24 20:14
 */
public class Demo6 {
    public static void main(String[] args) {
        MaxPri maxPri = new MaxPri();
        MinPri minPri = new MinPri();
        Thread maxThread = new Thread(maxPri,"优先级较高的线程");
        Thread minThread = new Thread(minPri,"优先级较低的线程");
        maxThread.setPriority(10);
        minThread.setPriority(1);
        maxThread.start();
        minThread.start();
    }
}
class MaxPri implements Runnable{
    public void run(){
        for(int i = 0;i<15;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
class MinPri implements Runnable{
    public void run(){
        for(int i = 0;i<15;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
