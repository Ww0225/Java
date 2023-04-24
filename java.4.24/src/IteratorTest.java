import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 28953
 * @create 2023-04-24 15:51
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(789);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry",18));
        coll.add(false);
        Iterator iterator = coll.iterator();
        /*while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if("Tom".equals(obj)){
                iterator.remove();
            }
        }
        iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
