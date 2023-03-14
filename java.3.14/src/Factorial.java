import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入你想要计算的数字的阶乘:");
        int n = scan.nextInt();
        int sum = f.getFactorial(n);
        System.out.println(n + "的阶乘为：" + sum);
    }
    public int getFactorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * getFactorial(n - 1);
        }
    }
}
