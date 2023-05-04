/**
 * 程序功能：输出九九乘法表。
 * 程序要求：
 * （1）、请定义一个名为printCheng方法，该方法的功能是实现打印九九乘法表。
 * （2）、在主方法main中调用该方法三次。
 *
 * @author 28953
 * @create 2023-05-01 17:04
 */
public class Lx4 {
    public static void main(String[] args) {
        System.out.println("---------- 运行 ----------");
        System.out.println("\t*\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9\t");
        System.out.println("--------|-----------------------------------------");
        int x = 0;
        int y = 0;
        for(x=1;x<=9;x++)
        {
            System.out.print("\t"+x+"\t|");
            for(y=1;y<=x;y++){
                System.out.print("\t"+x*y);
            }
            System.out.println();
        }
    }
}

