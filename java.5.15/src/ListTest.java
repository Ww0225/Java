import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 练习：在list内去除重复数字值，要求尽量简单
 *
 * @author 28953
 * @create 2023-05-15 22:25
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        List list2 = dupcateList(list);
        for(Object integer : list2){
            System.out.println(integer);
        }
    }
    public static List dupcateList(List list){
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }
}

