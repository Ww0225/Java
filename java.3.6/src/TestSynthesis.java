import java.util.Scanner;
public class TestSynthesis {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        for(;;)
        {
            int num = scan.nextInt();
            if(num > 0)
            {
                count1++;
            }
            else if(num < 0)
            {
                count2++;
            }
            else
            {
                break;
            }
        }
        System.out.println("正数有："+ count1 + "个");
        System.out.println("负数有："+ count2 + "个");
    }
}