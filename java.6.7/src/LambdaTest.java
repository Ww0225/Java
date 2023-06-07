import org.junit.Test;

/**
 * @author 28953
 * @create 2023-06-07 22:12
 */
public class LambdaTest {
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京");
            }
        };
        r1.run();
        Runnable r2 = () -> System.out.println("我爱北京");
        r2.run();
    }
}
