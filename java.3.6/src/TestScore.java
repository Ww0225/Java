import java.util.Scanner;
public class TestScore {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = scan.nextInt();
        switch (score / 10)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println('D');
                break;
            case 6:
                System.out.println('C');
                break;
            case 7:
            case 8:
                System.out.println('B');
                break;
            case 9:
            case 10:
                System.out.println('A');
                break;
        }

    }
}
