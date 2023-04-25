import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 28953
 * @create 2023-04-25 9:10
 */
public class Demo4 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("张三");
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
