import java.util.Scanner;

/**
 * 描述
 * 输入NxM矩阵，矩阵元素均为整数，计算其中大于零的元素之和。
 *
 * 输入描述：
 * 第一行为N M(N: 矩阵行数；M: 矩阵列数,且M,N<=10)，接下来的N行为矩阵各行。
 *
 * 输出描述：
 * 一行，其中大于零的元素之和。
 *
 * @author 28953
 * @create 2023-05-30 20:10
 */
public class MCTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int total = 0;
        int[][] numArr = new int[N][M];
        for(int i =0;i<N;i++){
            for(int j = 0;j<M;j++){
                numArr[i][j] = in.nextInt();
                if(numArr[i][j]>0){
                    total+=numArr[i][j];
                }
            }
        }
        System.out.println(total);
    }
}
