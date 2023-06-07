import org.junit.Test;
import java.util.Comparator;
import java.util.function.Consumer;

/**.
 * Lambda表达式的使用
 * 1.举例: (o1,o2) -> Integer.compare(o1,o2);
 * 2.格式:
 *          ->  :Lambda操作符 或 箭头操作符
 *          -> 左边:Lambda形参列表（其实就是接口中的抽象方法的形参列表）
 *          -> 右边：Lambda体（其实就是重写的抽象方法的方法体）
 *
 * 3.Lambda 表达式的使用： 分6种情况
 *
 * 4.Lambda表达式的本质：作为接口的实例
 *
 * @author 28953
 * @create 2023-06-07 22:20
 */
public class LambdaTest1 {
    //一：无参，无返回值
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
    //二：Lambda需要一个参数，但是没有返回值
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");
        Consumer<String> con1 = (String s) -> {System.out.println(s);};
        con1.accept("没有区别");
    }
    //三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void test3(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");
        Consumer<String> con1 = (s) -> {System.out.println(s);};
        con1.accept("没有区别");
    }
    //四：Lambda若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");
        Consumer<String> con1 = s -> {System.out.println(s);};
        con1.accept("没有区别");
    }
    //五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println("******************");
        Comparator<Integer> com2 = (o1,o2) -> {System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);};
    }
    //六：当Lambda体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test6(){
        Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);
    }
}
