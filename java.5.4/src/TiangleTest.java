import java.util.Scanner;

/**
 * @author 28953
 * @create 2023-05-04 22:48
 */
public class TiangleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        try {
            if((a+b>c)||(a+c>b)||(b+c>a)&&a>0&&b>0&&c>0){
                double p = a+b+c;
                double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("边长为:"+a+","+b+","+c+"的面积为:"+s);
            }
            else{
                throw new Exception("输入的三条边有误");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
