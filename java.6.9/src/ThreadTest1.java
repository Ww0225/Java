/**
 * @author 28953
 * @create 2023-06-09 11:27
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i = 0;i<10;i++){
            System.out.println("main run..."+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<15;i++){
            System.out.println("MyThread run..."+i);
        }
    }
}
