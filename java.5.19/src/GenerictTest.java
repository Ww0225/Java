import java.util.List;

/**
 * 有限制条件的通配符的使用
 *      ? extends Person  <=
 *      ? super Person   >=
 *
 *
 * @author 28953
 * @create 2023-05-21 15:06
 */
public class GenerictTest {
    public static void main(String[] args) {
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
        //list1 = list5;

        //list2 = list3;
        list2 = list4;
        list2 = list5;

        //读取数据
        list1=list4;
        Person person = list1.get(0);
        //编译不通过
        //Student s = list1.get(0);

        list2 = list4;
        Object object = list2.get(0);
        //编译不通过
        //Person p = list2.get(0);

        //写入数据:
        //编译不通过
        list2.add(new Person());
        list2.add(new Student());


    }
}
