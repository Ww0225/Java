import java.util.ArrayList;
import java.util.List;

/**
 * @author 28953
 * @create 2023-05-14 16:03
 */
public class ListExer {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }
    private static void updateList(List list){
        list.remove(2);
        list.remove(new Integer(2));
    }
}
