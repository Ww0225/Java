import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * @author 28953
 * @create 2023-05-13 18:25
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jarry",20);
        coll.add(p);
        Iterator iterator = coll.iterator();
        //hasNext():判断是否还有下一个元素
        while(iterator.hasNext()){
            //next():1.指针下移
            //       2.将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }
}
