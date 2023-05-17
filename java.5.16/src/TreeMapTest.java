import java.util.*;

/**
 * @author 28953
 * @create 2023-05-17 20:50
 */
public class TreeMapTest {
    public static void main(String[] args) {
        //向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
        //应为要按照key进行排序：自然排序、定制排序
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof  Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else{
                    throw new RuntimeException("传入的的数据不一致");
                }
            }
        });
        Person p1 = new Person("Tom",23);
        Person p2 = new Person("Jerry",32);
        Person p3 = new Person("Jack",20);
        Person p4 = new Person("Rose",18);
        map.put(p1,98);
        map.put(p2,89);
        map.put(p3,76);
        map.put(p4,100);
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            Object value = map.get(key);
            System.out.println(key+"-->"+value);
        }
    }
}
