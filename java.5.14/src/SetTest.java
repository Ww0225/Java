import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Set接口：存储无序的、不可重复的数据
 *      HashSet:作为Set接口的主要实现类：线程不安全，可以存储null
 *          LinkedHashSet:作为HashSet的子类：遍历其内部数据时，可以按照添加的顺序遍历
 *                          对于频繁的遍历操作，LinkedHashSet效率高于HashSet
 *      TreeSet:可以按照添加对象的指定属性，进行排序
 *  无序性：以HashSet为例说明，存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的
 *
 *  不可重复性：保证添加的元素按照equals()判断时，不能返回true
 *              即：相同的元素只能添加一个
 *
 *  添加元素的过程：以HashSet为例：
 *      我们向HashSet中添加元素a，首先调用元素a所在类的hashCode()方法，计算元素a的哈希值，
 *      此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置(即为：索引位置)，
 *      判断数组此位置上是否已经有元素：
 *          如果此位置上没有其他元素，则元素a添加成功
 *          如果此位置上没有其他元素b（或以链表形式存在多个元素），则比较元素a与元素b的hash值：
 *              如果hash值不相同，则元素a添加成功
 *              如果hash值相同，进而需要调用元素a所在类的equals()方法：
 *                  equals()返回true，元素a添加失败
 *                  equals()返回false，则元素a添加成功
 *
 * HashSet底层：数组+链表
 *
 * 要求：向Set中添加的数据，其所在的类一定要重写hashCode()和equals()
 *       重写的方法尽可能保持一致性：相等的对象必须具有相等的散列码
 *
 * @author 28953
 * @create 2023-05-14 16:09
 */
public class SetTest {
    public static void main(String[] args) {
        //LinkedHashSet的使用
        //作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录此数据前一个数据和后一个数据
        //优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));
        set.add(129);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
