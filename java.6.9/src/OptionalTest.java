import org.junit.Test;

import java.util.Optional;

/**
 * @author 28953
 * @create 2023-06-11 22:17
 */
public class OptionalTest {
    @Test
    public void test1(){
        Optional<Object> op1 = Optional.empty();
        if(op1.isPresent()){
            System.out.println("empty");
        }
        System.out.println(op1);
    }
    @Test
    public void test2(){
        String str = "hello";
        Optional<String> op1 = Optional.of(str);
        String str1 = op1.get();
        System.out.println(str1);
    }
    @Test
    public void test3(){
        String str1 = "beijing";
        Optional<String> op1 = Optional.ofNullable(str1);
        String str2 = op1.orElse("shanghai");
        System.out.println(str2);
    }
}
