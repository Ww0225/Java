import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述
 * 输入n科成绩（浮点数表示），统计其中的最高分，最低分以及平均分。
 *
 * 数据范围：
 * 1≤n≤100  ， 成绩使用百分制且不可能出现负数
 * 输入描述：
 * 两行
 * 第1行，正整数n（1≤n≤100）
 * 第2行，n科成绩（范围0.0~100.0），用空格分隔。
 * 输出描述：
 * 输出一行，三个浮点数，分别表示，最高分，最低分以及平均分（小数点后保留2位），用空格分隔。
 *
 * @author 28953
 * @create 2023-05-30 19:45
 */
public class Scores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] scores = new double[n];
        for(int i = 0;i<n;i++){
            scores[i] = in.nextDouble();
        }
        System.out.printf("%.2f %.2f %.2f",Arrays.stream(scores).max().getAsDouble(),
                Arrays.stream(scores).min().getAsDouble(),
                Arrays.stream(scores).average().getAsDouble());
    }
}
