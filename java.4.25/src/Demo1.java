import java.util.ArrayList;

/**
 * @author 28953
 * @create 2023-04-25 8:03
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList c1 = new ArrayList();
        c1.add("宋江");
        c1.add("吴用");
        c1.add("武松");
        ArrayList c2 = new ArrayList();
        c2.add("武松");
        c2.add("李逵");
        c2.add("石清");
        c1.addAll(c2);
        System.out.println("查看元素个数："+c1.size());
        System.out.println(c1);
        c1.remove("李逵");
        System.out.println("查看元素个数："+c1.size());
        System.out.println(c1);
        System.out.println("第三个元素:"+c1.get(2));
        c1.set(2,"李逵");
        System.out.println("修改后的第三个元素:"+c1.get(2));
        c1.clear();
        System.out.println("查看元素个数："+c1.size());
        System.out.println(c1);
    }
}
