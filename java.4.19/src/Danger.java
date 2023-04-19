import java.util.Scanner;

/**
 * KiKi想知道这学期他的学习情况，BoBo老师告诉他这学期挂的科目累计的学分，根据所挂学分，判断KiKi学习情况，10分以上：很危险(Danger++)，4~9分：危险(Danger)，0~3:Good。
 * 输入描述：
 * 一行，一个整数（0~30），表示KiKi挂的科目累计的学分。
 * 输出描述：
 * 一行，根据输入的挂科学分，输出相应学习情况（Danger++，Danger，Good）
 *
 * @author 28953
 * @create 2023-04-19 15:11
 */
public class Danger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if(score>=10){
            System.out.println("Danger++");
        }else if(score>=4&&score<=9){
            System.out.println("Danger");
        }else{
            System.out.println("Good");
        }
    }
}
