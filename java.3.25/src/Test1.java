import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        if(a1 + b1 < 100 )
        {
            System.out.print(a1+b1);
        }
        else{
            System.out.print((a1+b1)%100);
        }
        float f = in.nextFloat();
        System.out.print((int)f%10);
        int age = in.nextInt();
        double s = age * 3.156e7;
        System.out.printf("%.0f",s);
        int second = in.nextInt();
        int hours = second / 3600;
        int minues = (second-hours*3600) / 60;
        int seconds = (second - 3600 * hours - 60 * minues) % 60;
        System.out.printf("%d %d %d",hours,minues,seconds);
    }
}
