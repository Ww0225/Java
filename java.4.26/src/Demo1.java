import java.util.*;

/**
 * @author 28953
 * @create 2023-04-26 11:37
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(3,"王五");
        map.put(4,"马六");
        map.put(4,"王九");
        map.put(5,"田七");
        map.put(1,"张三");
        map.put(2,"李四");
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
        Collection<String> values = map.values();
        Iterator<String> iterator1 = values.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator2 = entries.iterator();
        while(iterator2.hasNext()){
            Map.Entry<Integer,String> entry = iterator2.next();
            System.out.print(entry.getKey()+":");
            System.out.print(entry.getValue()+" ");
        }
    }
}
