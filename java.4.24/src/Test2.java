import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 描述
 * 用筛选法求n以内的素数。筛选法求解过程为：将2~n之间的正整数放在数组内存储，将数组中2之后的所有能被2整除的数清0，再将3之后的所有能被3整除的数清0 ，以此类推，直到n为止。数组中不为0 的数即为素数。
 * 输入描述：
 * 多组输入，每行输入一个正整数（不大于100）。
 * 输出描述：
 * 针对每行输入的整数n，输出两行，第一行，输出n之内（包括n）的素数，用空格分隔，
 *
 * 第二行，输出数组中2之后被清0 的个数。每行输出后换行。
 *
 * @author 28953
 * @create 2023-04-24 8:53
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            //存放数据的集合
            List<Integer> toPrintList = new ArrayList<>();
            //清零后的数
            int afterDeleteNum = 0;
            //将符合条件的数添加到集合中
            for(int i = 2;i<n;i++)
            {
                boolean flag = true;
                //素数判断
                for(int j = 2;j<i;j++)
                {
                    if(i%j==0){
                        flag = false;
                        break;
                    }
                }
                if(flag==true){
                    toPrintList.add(i);
                }
            }
            for(int j = 0;j<toPrintList.size();j++)
            {
                System.out.print(toPrintList.get(j)+" ");
            }
            System.out.println();
            afterDeleteNum = n-1-toPrintList.size();
            System.out.println(afterDeleteNum);
        }
    }
}
