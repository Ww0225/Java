import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1.泛型在继承方面的体现
 *      类A是类B的父类，G<A>和G<B>二者不具备子父类关系，二者是并列关系
 *      A<G>和B<G>
 *
 * 2.通配符的使用
 *      通配符：?
 *      类A是类B的父类，G<A>和G<B> 是没有关系的，二者共同的父类是：G<?>
 *
 * @author 28953
 * @create 2023-05-21 10:55
 */
public class GenericTest {
    public static void main(String[] args) {
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1=arr2;

        List<Object> list1 = null;
        List<String> list2 = new ArrayList<String>();
        //编译不通过
        // list1 = list2;

        List<String> list3 = null;
        ArrayList<String> list4 = null;
        list3 = list4;
        /*
        反证法
        假设list1=list2
        list1.add(123);导致混入非String的数据，出错
        */

        List<Object> list5 = null;
        List<String> list6 = null;
        List<?> list = null;
        list = list1;
        list = list2;

        //print(list1);
        //print(list2);

        List<String> list7 = new ArrayList<>();
        list7.add("AA");
        list7.add("BB");
        list7.add("CC");
        list = list3;
        //添加(写入)：对于List<?>就不能向其内部添加数据
        //例外：null
        list.add(null);
        //list.add();

        //获取(读取)：
        Object o = list.get(0);
        System.out.println(o);

    }
    public static void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
