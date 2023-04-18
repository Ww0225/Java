import java.util.Scanner;

/**
 * @author 28953
 * @create 2023-04-18 22:16
 */
public class FanXieXian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int number = in.nextInt();
            for(int i =1;i<=number;i++)
            {
                for(int j =1;j<=i-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
