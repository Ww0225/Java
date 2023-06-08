import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1.Stream关注的是对数据的运算，与CPU打交道
 *   集合关注的是数据的存储，与内存打交道
 * 2.Stream 自己不会存储元素
 *   Stream 不会改变源对象，相反，他们会返回一个持有结果的新Stream
 *   Stream 操作是延迟执行的，这意味着他们会等到需要结果的时候才执行
 * 3.Stream执行流程
 *      Stream的实例化
 *      一系列的中间操作（过滤，映射）
 *      终止操作
 * 4.说明：
 *  一个中间操作链，对数据源的数据进行处理
 *  一旦执行终止操作，就执行中间操作链，并产生结果，之后不会再被使用
 * @author 28953
 * @create 2023-06-08 16:06
 */
public class StreamAPITest {
    //创建Stream方式一：通过集合
    @Test
    public void test1(){
        //default Stream<E> stream():返回一个顺序流

        //default Stream<E> parallelStream():返回一个并行流
    }
    //创建Stream方式二：通过数组
    @Test
    public void test2(){
        //调用Arrays类的static <T> Stream<T> stream(T[] array):返回一个流
        int[] arr = new int[]{1,2,3,4,5,6};
        IntStream intStream = Arrays.stream(arr);
    }
    //创建Stream方式三：通过Stream的of()
    @Test
    public void test3(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
    }

}
