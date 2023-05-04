import java.util.Scanner;

/**
 * 使用 if...else 语句（程序命名为Lx1）
 * 程序功能：使用 if...else 语句构造分支，判断某一年是否为闰年。
 * 闰年的条件是符合下面二者之一：能被 4 整除，但不能被 100 整除；能被400 整除
 *
 * @author 28953
 * @create 2023-05-01 15:29
 */
public class Lx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
}
