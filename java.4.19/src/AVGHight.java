import java.util.Scanner;

/**
 * 从键盘输入5个人的身高（米），求他们的平均身高（米）。
 *
 * 输入描述：
 * 一行，连续输入5个身高（范围0.00~2.00），用空格分隔。
 * 输出描述：
 * 一行，输出平均身高，保留两位小数。
 *
 * @author 28953
 * @create 2023-04-19 15:04
 */
public class AVGHight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double average = 0.0;
        for(int i = 0;i<5;i++)
        {
            average += in.nextDouble();
        }
        System.out.printf("%.2f",average/5);
    }
}
