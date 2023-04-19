import java.util.Scanner;

/**
 * 该任务是打印用“*”组成的X形图案
 * @author 28953
 * @create 2023-04-19 13:58
 */
public class X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int high = in.nextInt();
            for(int i = 0;i<high;i++)
            {
                for(int j = 0;j<high;j++)
                {
                    if(i==j || (i+j)==(high-1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
