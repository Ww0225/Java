import java.util.Scanner;

/**
 * 描述
 * 任意输入一个正整数N，统计1~N之间奇数的个数和偶数的个数，并输出。
 * 输入描述：
 * 一行，一个正整数N（1≤N≤100,000）
 * 输出描述：
 * 一行，1~N之间奇数的个数和偶数的个数，用空格分开
 *
 * @author 28953
 * @create 2023-05-30 19:37
 */
public class JiOrOu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int jiNum = 0;
        int ouNum = 0;
        for(int i = 1;i<=N;i++){
            if(i%2==0){
                ouNum++;
            }else{
                jiNum++;
            }
        }
        System.out.println(jiNum+" "+ouNum);
    }
}
