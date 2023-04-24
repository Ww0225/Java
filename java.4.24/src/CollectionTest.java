import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author 28953
 * @create 2023-04-24 12:39
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        //Person p = new Person("Jerry",18);
        //coll.add(p);
        coll.add(new Person("Jerry",18));
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        //System.out.println(coll.contains(p));
        System.out.println(coll.contains(new Person("Jerry",18)));//false

        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));
    }
}
