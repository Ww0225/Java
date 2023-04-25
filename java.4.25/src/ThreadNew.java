import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 28953
 * @create 2023-04-25 10:18
 */
public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
