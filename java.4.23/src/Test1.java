import java.util.Scanner;

/**
 * @author 28953
 * @create 2023-04-23 21:29
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int high = in.nextInt();
            for(int i = 0;i<high;i++)
            {
                for(int j = 0;j<high;j++)
                {
                    if(i+j<high-1){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
