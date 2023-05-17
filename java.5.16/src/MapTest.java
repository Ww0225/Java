import java.util.*;

/**
 * |---Map:双列数据，存储key-value对的数据   --类似于高中的函数：y=f(x)
 *      |---HashMap:作为Map的主要实现类:线程不安全，效率高;存储null值
 *          |---LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序遍历
 *               原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素
 *               对于频繁的遍历操作，此类效率高于HashMap
 *      |---TreeMap:保证按照添加的key-value对进行排序，实现排序遍历，此时考虑key的自然排序或定制排序
 *              底层使用红黑树
 *      |---Hashtable:作为古老的实现类:线程安全，效率低;不能存储null值
 *          |---Properties:常用来处理配置文件。key和value都是String类型
 *
 *      HashMap的底层：数组+链表（jdk7之前）
 *                    数组+链表+红黑树（jdk8）
 *
 * Map结构的理解
 *      Map中的key：无序的、不可重复的，使用Set存储所有的key  -->key所在类要重写equals()和hashCode()(以hashMap为例)
 *      Map中的value：无序的，可重复的，使用Collection存储所有value   -->value所在类要重写equals()
 *      一个键值对：key-value构成了一个Entry对象
 *      Map中的Entry：无序的，不可重复的，使用Set存储所有的entry
 * HashMap的底层实现原理？(jdk7)
 *   HashMap map = new HashMap():
 *   在实例化以后，底层创建了长度是16的一维数组Entry[] table
 *   map.put(key1,value1):
 *   首先，调用key1所在类的hashCode()计算key1哈希值，此哈希值经过某种算法计算以后，得到在Entry数组中的存放位置
 *    如果此位置上的位置为空，此时的key1-value1添加成功
 *    如果此位置上的数据不为空，（意味着此位置上存在一个或多个数组（以链表形式存在））
 *    比较key1和已经存在的一个或多个数据的哈希值：
 *              如果key1的哈希值与已经存在的数据的哈希值都不相同，此时key1-value1添加成功 --情况2
 *              如果key1的哈希值与已经存在的某一个数据(key2-value2)的哈希值相同，继续比较：调用equals()
 *                  比较：如果equals()返回false：此时key1-value1添加成功 --情况3
 *                        如果equals()返回true：使用value1替换value2
 *    扩容问题：当超出临界值(且要存放的位置非空)时，扩容为原来容量的2倍，并将原有的数据复制过来
 *  (jdk8):
 *  new HashMap()：底层没有创建一个长度为16的Entry数组
 *  底层的数组是：Node[],而非Entry[]
 *  首次调用put()方法时，底层创建长度为16的数组
 *  底层结构：数组+链表+红黑树
 *     当数组的某一个索引位置上的元素以链表形式存在的数据个数>8且当前数组的长度>64时，
 *     此时此索引位置上的所有数据改为使用红黑树存储
 *
 * 面试题：
 * 1.HashMap的底层实现原理？
 * 2.HashMap和Hashtable的异同？
 * 3.CurrentHashMap 与 Hashtable的异同？
 *
 *
 * @author 28953
 * @create 2023-05-16 20:51
 */
public class MapTest {
    public static void main(String[] args) {
        //添加、删除、修改：
        //put(Object key,Object value):将指定key-value添加到(或修改)当前map对象中
        //putAll(Map m):将m中的所有key-value对存放到当前map中
        //remove(Object key):移除指定key的key-value对，并返回value
        //clear():清空当前map中的所有数据
        //查询:
        //get(Object key):获取指定key对应的value
        //containsKey(Object key):是否包含指定的key
        //containsValue(Object value):是否包含指定的value
        //size():返回map中key-value对的个数
        //isEmpty():判断当前map是否为空
        //equals(Object ojb):判断当前map和参数对象obj是否相等
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        map.put("AA",87);//修改
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);

        map.putAll(map1);
        System.out.println(map);

        System.out.println(map.get(45));
        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);

        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println("********************************");

        map.put("AA",123);
        map.put(45,1234);
        map.put("BB",56);
        map.put("AA",87);

        //遍历所有的key集：keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        //遍历所有的value集：values()
        Collection values = map.values();
        for(Object obj : values){
            System.out.println(obj);
        }
        System.out.println();
        //遍历所有的key-value
        //方式一：entrySet():
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
        System.out.println("************");
        //方式二：
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value1 = map.get(key);
            System.out.println(key+"-->"+value1);
        }
    }
}
