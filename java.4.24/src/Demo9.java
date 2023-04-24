/**
 * @author 28953
 * @create 2023-04-24 21:26
 */
public class Demo9 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread9());
        thread.start();
        for(int i = 0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+i);
            if(i==5){
                thread.join();
            }
        }
    }
}
class MyThread9 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<20;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
