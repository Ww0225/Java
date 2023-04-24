/**
 * 线程让步，yield方法的使用-
 * @author 28953
 * @create 2023-04-24 21:01
 */
public class Demo8 {
    public static void main(String[] args) {
        MyThread5 myThread1 = new MyThread5("线程B");
        MyThread5 myThread2 = new MyThread5("线程C");
        myThread1.start();
        myThread2.start();
    }
}
class MyThread5 extends Thread{
    public MyThread5(String name){
        super(name);
    }
    public void run(){
        for(int i = 0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+i);
            if(i==5){
                System.out.println(Thread.currentThread().getName()+"让步");
                Thread.yield();//线程让步
            }
        }
    }
}
