import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet
 * @author 28953
 * @create 2023-04-25 9:38
 */
public class Demo6 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(18);
        treeSet.add(23);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(19);
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next ());
        }
    }
}
