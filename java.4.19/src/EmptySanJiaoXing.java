import java.util.Scanner;

/**
 * KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的“空心”三角形图案。
 * 输入描述：
 * 多组输入，一个整数（3~20），表示输出的行数，也表示组成三角形边的“*”的数量。
 * 输出描述：
 * 针对每行输入，输出用“*”组成的“空心”三角形，每个“*”后面有一个空格
 *
 * @author 28953
 * @create 2023-04-19 14:51
 */
public class EmptySanJiaoXing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int high = in.nextInt();
            for(int i = 1;i<=high;i++)
            {
                for(int j = 1;j<=i;j++)
                {
                    if(j==1||i==high||j==i){
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
