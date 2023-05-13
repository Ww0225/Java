import java.util.ArrayList;
import java.util.Collection;

/**
 * jdk5.0 新增了foreach循环，用于遍历集合和数组
 * for(集合元素的类型(Object) 局部变量(obj) : 集合对象(coll))
 * 内部仍然调用了迭代器
 *
 * @author 28953
 * @create 2023-05-13 21:34
 */
public class ForTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jarry",20);
        coll.add(p);
        for(Object obj : coll){
            System.out.println(obj);
        }
        int[] arr = new int[]{1,2,3,4,5,6};
        for(int i : arr){
            System.out.println(i);
        }
    }
}
