import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
 * 输入描述：
 * 第一行输入一个整数(0≤N≤50)。
 * 第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
 * 第三行输入想要进行插入的一个整数。
 *
 * 输出描述：
 * 输出为一行，N+1个有序排列的整数。
 *
 * @author 28953
 * @create 2023-04-24 7:49
 */
public class Test1 {
    public static void main(String[] args) {
        //方式一
        /*Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int N = in.nextInt();
            int[] arrN = new int[N+1];
            for(int i = 0;i<arrN.length;i++){
                arrN[i] = in.nextInt();
            }
            Arrays.sort(arrN);
            for(int i = 0;i<arrN.length;i++)
            {
                System.out.print(arrN[i]+" ");
            }*/
        //方式二
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int data = scanner.nextInt();
            treeSet.add(data);
        }
        int added = scanner.nextInt();
        treeSet.add(added);
        Iterator<Integer> i = treeSet.iterator();
        while (i.hasNext()) {
            System.out.printf("%d ", i.next());
        }

    }
}
