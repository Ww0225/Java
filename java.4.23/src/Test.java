import java.util.Arrays;
import java.util.Scanner;

/**
 * 公务员面试现场打分。有7位考官，从键盘输入若干组成绩，每组7个分数（百分制），去掉一个最高分和一个最低分，输出每组的平均成绩。
 * （注：本题有多组输入）
 * 输入描述：
 * 每一行，输入7个整数（0~100），代表7个成绩，用空格分隔。
 * 输出描述：
 * 每一行，输出去掉最高分和最低分的平均成绩，小数点后保留2位，每行输出后换行。
 *
 * @author 28953
 * @create 2023-04-23 19:50
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sum = 0;
        while (in.hasNextInt()) {
            int[] score = new int[7];
            for(int i = 0;i<7;i++)
            {
                score[i] = in.nextInt();
            }
            Arrays.sort(score);
            for(int i = 1;i<6;i++)
            {
                sum += score[i];
            }
            System.out.printf("%.2f\n",sum/5);
        }
    }
}
