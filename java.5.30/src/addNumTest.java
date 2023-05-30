import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 描述
 * 有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
 *
 * 输入描述：
 * 共三行，
 * 第一行输入一个整数(0≤N≤50)。
 * 第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
 * 第三行输入想要进行插入的一个整数。
 *
 * 输出描述：
 * 输出为一行，N+1个有序排列的整数。
 *
 * @author 28953
 * @create 2023-05-30 19:57
 */
public class addNumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<N;i++){
            arrayList.add(in.nextInt());
        }
        int addNum = in.nextInt();
        arrayList.add(addNum);
        Collections.sort(arrayList);
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
