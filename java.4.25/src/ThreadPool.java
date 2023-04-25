import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 28953
 * @create 2023-04-25 14:13
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new NumberThread());//适用于Runnable
        //service.submit(Callable callable);//适用于Callable

    }
}
class NumberThread implements Runnable{

    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
