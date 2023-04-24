/**
 * 继承Thread类方法实现多线程
 * @author 28953
 * @create 2023-04-24 19:39
 */
public class Demo4_Plus {
    public static void main(String[] args) {
        MyThread_2 myThread_2 = new MyThread_2();
        myThread_2.start();
        while(true){
            System.out.println("Demo4_Plus类的main方法运行");
        }
    }
}
class MyThread_2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("MyThread_2类的run方法运行");
        }
    }
}
