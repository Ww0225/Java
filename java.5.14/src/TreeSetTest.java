import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 向TreeSet中添加的数据，要求是相同类的对象
 * 两种排序方式：自然排序(实现Comparable接口) 和 定制排序(Comparator)
 * 自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals()
 * 定制排序中，比较两个对象是否相同的标准为：compare()返回0，不再是equals()
 *
 * @author 28953
 * @create 2023-05-14 21:34
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

      /* 失败：不能添加不同类的对象
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add(new Person("Tom",12));*/

        /* 举例一：
        set.add(34);
        set.add(-34);
        set.add(43);
        set.add(11);
        set.add(8);*/

        //举例二：
        set.add(new Person("Tom",12));
        set.add(new Person("Jerry",34));
        set.add(new Person("Jim",45));
        set.add(new Person("Mike",56));
        set.add(new Person("Jack",67));
        set.add(new Person("Jack",35));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****************************");

        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        TreeSet set1 = new TreeSet(com);
        set1.add(new Person("Tom",12));
        set1.add(new Person("Jerry",34));
        set1.add(new Person("Jim",45));
        set1.add(new Person("Mike",56));
        set1.add(new Person("Jack",67));
        set1.add(new Person("Jack",35));

        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
