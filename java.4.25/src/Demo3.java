import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 28953
 * @create 2023-04-25 8:43
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("宋江");
        list.add("吴用");
        list.add("武松");
        list.add("武松");
        list.add("李逵");
        list.add("石清");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
