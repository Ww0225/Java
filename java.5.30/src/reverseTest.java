import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 描述
 * 输入10个整数，要求按输入时的逆序把这10个数打印出来。逆序输出，就是按照输入相反的顺序打印这10个数。
 *
 * 输入描述：
 * 一行，输入10个整数（范围-231~231-1），用空格分隔。
 *
 * 输出描述：
 * 一行，逆序输出输入的10个整数，用空格分隔。
 *
 * @author 28953
 * @create 2023-05-30 20:22
 */
public class reverseTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        for(int i = 0;i<10;i++){
            arrayList.add(in.nextInt());
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
