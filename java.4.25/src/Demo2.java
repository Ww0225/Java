import java.util.LinkedList;

/**
 * @author 28953
 * @create 2023-04-25 8:26
 */
public class Demo2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("张三");
        list.add("李四");
        list.add(1,"王五");
        System.out.println(list);
        list.addFirst("赵六");
        System.out.println(list);
        Object first = list.getFirst();
        System.out.println("第一个元素:"+first);
        Object last = list.getLast();
        System.out.println("最后一个元素:"+last);
        Object removefirst = list.removeFirst();
        System.out.println("移除的第一个元素是:"+removefirst);
        Object removelast = list.removeLast();
        System.out.println("移除的最后一个元素是:"+removelast);
    }
}
