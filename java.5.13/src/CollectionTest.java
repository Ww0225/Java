import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 向Collection接口的实现类的对象中添加数据obj时
 * 要求obj所在类要重写equals()
 *
 * @author 28953
 * @create 2023-05-13 17:00
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jarry",20);
        coll.add(p);

        //contains(Object obj):判断当前集合中是否包含obj
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(p));//true
        System.out.println(coll.contains(new Person("Jarry",20)));

        //containsAll(Collection coll1):判断形参coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));

        //retainAll(Collection coll1)：交集：获取当前集合和coll1集合的交集，并返回给coll
        coll.retainAll(coll1);
        System.out.println(coll);

        //remove(Object obj):从当前集合中移除obj元素
        coll.remove(123);
        System.out.println(coll);

        //removeAll(Collection coll1):差集：从当前集合中移除coll1中的所有元素
        coll.removeAll(coll1);
        System.out.println(coll);

        //hashCode():返回当前对象的哈希值

        //集合-->数组：toArray()
        Object[] objects = coll.toArray();
        for(int i = 0;i<objects.length;i++){
            System.out.println(objects[i]);
        }

        //数组-->集合：asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);
        List arr = Arrays.asList(new int[]{123,456});
        System.out.println(arr.size());//1
        List arr1 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr1.size());//2
    }
}
