import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 面试题：Collection和Collections的区别？
 *
 *
 * @author 28953
 * @create 2023-05-17 21:49
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);
        System.out.println(list);
        //reverse(List):反转 List 中元素的顺序
        Collections.reverse(list);
        System.out.println(list);
        //shuffle(List):对List集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println(list);
        //sort(List):升序排序
        Collections.sort(list);
        System.out.println(list);
        //swap(List,int i,int j):将指定List集合中的i处元素和j处元素进行交换
        Collections.swap(list,1,2);
        System.out.println(list);

        //copy(List desc,List src)
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest,list);
        System.out.println(dest);
        //Collection类中提供了多个 synchronizedXxx()方法，
        //该方法可使指定集合包装成线程同步的集合，从而解决线程安全问题
        List list1 = Collections.synchronizedList(list);
    }
}
