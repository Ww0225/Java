import java.util.*;

/**
 *  面试题：ArrayList、LinkedList、Vector三者的异同？
 *  同：三个类都是实现了List接口，存储数据的特点相同：存储有序的、可重复的数据
 *  不同： ArrayList：作为List接口的主要实现类：效率高，线程不安全，底层使用Object[]存储
 *        LinkedList：对于频繁的插入、删除操作，使用此类效率比ArrayList高：底层使用双向链表存储
 *        Vector：作为List接口的古老实现类：效率低，线程安全，底层使用Object[]存储
 *
 *  ArrayList的源码分析：
 *  jdk7情况下
 *      ArrayList list = new ArrayList():底层创建了长度是10的Object[]数组elementData
 *      如果添加导致底层elementData数组容量不够，则扩容
 *      默认情况下，扩容为原来的1.5倍，同时需要将原有数组中的数据复制到新的数组中
 *      结论：建议开发中使用带参的构造器：ArrayList list = new ArrayList(int capacity)
 *
 * jdk8情况下:
 *      ArrayList list = new ArrayList():底层Object[] elementData初始化为{},并没有创建长度为10的数组
 *      第一次调用add()时，底层才创建了长度10的数组
 *      后续的添加和扩容与jdk7无异
 * 小结：jdk7中的ArrayList的对象的创建类似于单例的饿汉式，
 *      而jdk8中的ArrayList的对象的创建类似于单例的懒汉式，延迟了数组的创建，节省内存
 *
 * LinkedList的源码分析：
 *      LinkedList list = new LinkedList()：内部声明了Node类型的first和last属性，默认值为null
 *      list.add(123),将123封装到Node中，创建了Node对象
 *      其中Node定义为：
 *      private static class Node<E>{
 *          E item;
 *          Node<E> next;
 *          Node<E> prev;
 *
 *          Node(Node<E> prev,E element,Node<E> next){
 *              this.item = element;
 *              this.next = next;
 *              this.prev = prev;
 *          }
 *      }
 *
 * @author 28953
 * @create 2023-05-14 10:12
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);
        System.out.println(list);
        //add(int index,Object ele):在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);

        //addAll(int index,Collection eles):从index位置开始将eles中的所有元素添加到list中
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);

        //get(int index):获取指定index位置元素
        System.out.println(list.get(0));

        //indexOf(Object obj):返回obj在集合中首次出现的位置,如果不存在，则返回-1
        int index = list.indexOf(456);
        System.out.println(index);

        //lastIndexOf(Object obj):返回obj在集合中末次出现的位置
        int lastIndex = list.lastIndexOf(456);
        System.out.println(lastIndex);

        //remove(int index):移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println(list);

        //set(int index,Object ele):设置指定index位置的元素为ele
        list.set(0,"CC");
        System.out.println(list);

        //subList(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的子集合
        List subList = list.subList(4, 8);
        System.out.println(subList);

        //方式一：Iterator迭代器方式
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        //方式二：增强for循环
        for(Object obj : list){
            System.out.print(obj+" ");
        }
        System.out.println();
        //方式三；普通for循环
        for(int i = 0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }

    }
}
class Person implements Comparable{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Person...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    //按照姓名从小到大排列,年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person)o;
            int compare =  this.name.compareTo(person.name);
            if(compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age,person.age);
            }
        }else{
            throw new RuntimeException("输入类型不匹配");
        }
    }
}
