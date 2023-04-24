/**
 * @author 28953
 * @create 2023-04-24 19:47
 */
public class Demo5 {
    public static void main(String[] args) {
        MyThread_3 myThread_3 = new MyThread_3();
        Thread t1 = new Thread(myThread_3);
        t1.start();
        while(true){
            System.out.println("Demo5类的main方法运行");
        }
    }
}
class MyThread_3 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("MyThread类的run方法运行");
        }
    }
}
