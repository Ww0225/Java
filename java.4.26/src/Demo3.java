import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author 28953
 * @create 2023-04-26 13:32
 */
public class Demo3 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
        ht.put(3,"王五");
        ht.put(4,"马六");
        ht.put(4,"王九");
        ht.put(5,"田七");
        ht.put(1,"张三");
        ht.put(2,"李四");
        Enumeration<Integer> keys = ht.keys();
        while(keys.hasMoreElements()){
            Integer key = keys.nextElement();
            String value = ht.get(key);
            System.out.println(key+":"+value+" ");
        }
        Enumeration<String> elements = ht.elements();
        while(elements.hasMoreElements()){
            String value = elements.nextElement();
            System.out.println(value);
        }
    }
}
