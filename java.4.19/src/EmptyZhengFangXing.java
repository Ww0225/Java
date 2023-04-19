import java.util.Scanner;

/**
 * KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的“空心”正方形图案。
 * 输入描述：
 * 多组输入，一个整数（3~20），表示输出的行数，也表示组成正方形边的“*”的数量。
 * 输出描述：
 * 针对每行输入，输出用“*”组成的“空心”正方形，每个“*”后面有一个空格
 *
 * @author 28953
 * @create 2023-04-19 14:28
 */
public class EmptyZhengFangXing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int high = in.nextInt();
            for(int i = 0;i<high;i++)
            {
                for(int j =0;j<high;j++)
                {
                    if(i==0||i==high-1||j==0||j==high-1)
                    {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
