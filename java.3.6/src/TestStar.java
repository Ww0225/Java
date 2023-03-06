import java.util.Scanner;
public class TestStar {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int j = 0;
        for(i = 0;i <= n; i++)
        {
            for(j = 0;j < n - i;j++)
            {
                System.out.print(" ");
            }
            for(j = 0;j < 2*i-1 ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = 0;i < n; i++)
        {
            for(j = 0;j < i+1;j++)
            {
                System.out.print(" ");
            }
            for(j = 0;j < 2*(n-i-1)-1 ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}