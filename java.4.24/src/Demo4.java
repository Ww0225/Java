/**
 * @author 28953
 * @create 2023-04-24 19:33
 */
public class Demo4 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        while(true){
            System.out.println("Demo4类的main方法运行");
        }
    }
}
class MyThread{
    public void run(){
        while(true){
            System.out.println("MyThread类的run方法运行");
        }
    }
}
