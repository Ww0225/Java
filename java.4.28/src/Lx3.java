import java.util.Arrays;
import java.util.Scanner;

/**
 * 歌手打分：在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，
 * 去掉一个最高分，去掉一个最低分，然后剩余的8位评委的分数进行平均，
 * 就是该选手的最终得分。输入每个评委的评分，求某选手的得分。（程序命名为Lx3）
 * 实现思路：利用for语句，求出数组元素的最大值、最小值以及和，
 * 然后使用和减去最大值和最小值，然后除以8获得得分。
 *
 * @author 28953
 * @create 2023-05-01 16:37
 */
public class Lx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[10];
        double avg = 0.0;
        for(int i = 0;i<scores.length;i++)
        {
            scores[i]=in.nextInt();
        }
        Arrays.sort(scores);
        for(int i = 1;i<=8;i++){
            avg+=scores[i];
        }
        System.out.println("选手的最终分数为:"+avg/8);
    }
}
