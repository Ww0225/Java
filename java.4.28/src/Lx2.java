import java.util.Scanner;

/**
 * 使用 switch 语句（程序命名为Lx2）
 * 程序功能：编写程序，根据考试成绩的等级打印出百分制分数段。
 * 设 A 为 90 分及以上、B 为 80-89之间、C为 70-79 之间、D 为 60-69之间、E 为 59 分以下。
 * 比如：你从键盘上输入一个分数为89，则程序运行后，输出结果：你的成绩等级为B.
 * @author 28953
 * @create 2023-05-01 15:34
 */
public class Lx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        int level = score/10;
        switch(level){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("你的成绩等级为E");
                break;
            case 6:
                System.out.println("你的成绩等级为D");
                break;
            case 7:
                System.out.println("你的成绩等级为C");
                break;
            case 8:
                System.out.println("你的成绩等级为B");
                break;
            case 9:
            case 10:
                System.out.println("你的成绩等级为A");
                break;
            default:
                System.out.println("你输入的成绩有误");
        }
    }
}
