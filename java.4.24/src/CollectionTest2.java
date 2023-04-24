import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author 28953
 * @create 2023-04-24 15:18
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(789);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry",18));
        coll.add(false);
        System.out.println(coll.hashCode());
        Object[] arr = coll.toArray();
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        coll.remove(123);
        System.out.println(coll);
        coll.remove(new Person("Jerry",18));
        System.out.println(coll);

        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);
        Collection coll2 = Arrays.asList(123,456,789);
        coll.retainAll(coll2);
        System.out.println(coll);

        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1);
        System.out.println(arr1.size());

        List arr2 = Arrays.asList(new Integer[]{123,465});
        System.out.println(arr2.size());
    }
}
