/**
 * @author 28953
 * @create 2023-04-24 20:46
 */
public class Demo7 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new MyThread3());
        t1.start();
        for(int i = 0;i<20;i++)
        {
            if(i==5){
                Thread.sleep(9000);
            }
            System.out.println("main线程正在输出"+i);
        }
    }
}
class MyThread3 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            System.out.println("MyThread3线程正在输出"+i);
        }
    }
}
