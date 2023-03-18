import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String year = s.substring(0,4);
        String month = s.substring(4,6);
        String date = s.substring(6,8);
        System.out.println("year="+year);
        System.out.println("month="+month);
        System.out.println("date="+date);
        Scanner in = new Scanner(System.in);
        String[] s1 = in.nextLine().split("[,]");
        String[] word1 = s1[0].split("=");
        String[] word2 = s1[1].split("=");
        int a = Integer.parseInt(word1[1]);
        int b = Integer.parseInt(word2[1]);
        int tmp = a;
        a=b;
        b=tmp;
        System.out.println("a="+a+",b="+b);
        String a1 = in.nextLine();
        char c1 = a1.charAt(0);
        System.out.println((int)c1);
        int c  = 40;
        int d = 212;
        System.out.println((-8+22)*c-10+d/2);
    }
}
