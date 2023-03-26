import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf(a / b +" "+ a % b);
        int n = in.nextInt();
        for(int i = 0;i<4;i++)
        {
            System.out.print(n%10);
            n = n / 10;
        }
    }
}
