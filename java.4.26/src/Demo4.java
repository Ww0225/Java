import java.util.ArrayList;

/**
 * @author 28953
 * @create 2023-04-26 13:42
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        ArrayList list2 = new ArrayList();
        list2.add("d");
        list2.add("e");
        list2.add("f");
        list1.addAll(list2);
        System.out.println(list1.size());
        list1.remove(0);
        System.out.println(list1.size());
        System.out.println(list1);
        System.out.println(list1.get(2));
        list1.set(2,"a");
        System.out.println(list1.get(2));
        list1.clear();
        System.out.println(list1);
    }
}
