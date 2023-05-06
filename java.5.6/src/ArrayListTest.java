import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 1、使用ArrayList集合，对其添加10个不同的元素，并使用Iterator遍历该集合。
 *   提示：
 *   (1)、使用add()方法将元素添加到ArrayList集合中；
 *   (2)、调用集合的Iterator()方法获得Iterator对象，
 *      并调用Iterator的hasNext()和next()方法，迭代出集合中的所有元素。
 * 附：将随机生成的0—100的整数添加到ArrayList中并输出
 * @author 28953
 * @create 2023-05-06 14:26
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for(int i = 0;i<10;i++){
            arrayList.add(random.nextInt(100));
        }
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
