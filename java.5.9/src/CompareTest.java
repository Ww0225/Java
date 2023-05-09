import java.util.Arrays;
import java.util.Comparator;

/**
 * 一、说明：Java中的对象，正常情况下，只能进行比较： == 或 ！= ，不能使用 > 或 <
 *          但在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小
 *          如何实现？使用两个接口中的任何一个：Comparable 或 Comparator
 * 二、Comparable接口的使用
 * 1.像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法
 *   给出了比较两个对象大小的方式
 * 2.像String、包装类重写compareTo()方法以后，进行了从小到大的排列
 * 3.重写compareTo(obj)的规则
 *      如果当前对象this大于形参对象obj，则返回正整数
 *      如果当前对象this小于形参对象obj，则返回负整数
 *      如果当前对象this等于形参对象obj，则返回零
 * 4.对于自定类来说，如果需要排序，我们可以让自定义类实现Comparable接口
 *   重写compareTo(obj)方法，在方法中指明如何排序
 *
 * Comparator接口的使用: 定制排序
 * 1.背景:
 * 当元素的类型没有实现java.Lang.Comparable接口而又不方便修改代码
 * 或者实现了java.Lang.Comparable接口的排序规则不适合当前的操作
 * 那么可以考虚使用 Comparator 的对象来排序
 * 2.重与compare(object o1,object o2)方法，比较o1和2o的大小
 * 如果方法返回正整数，则表示1大于o2，
 * 如果返回0，表示相等.
 * 返回负整数，表示o1小于o2
 * @author 28953
 * @create 2023-05-09 11:26
 */
public class CompareTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"CC","AA","MM","GG"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof  String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

