/**
 * @author 28953
 * @create 2023-04-26 8:17
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
        s1="hello";
        System.out.println(s1==s2);
        System.out.println();
        String s3 = "abc";
        s3 += "def";
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
        String s4 = "abc";
        String s5 = s4.replace("a","w");
        System.out.println(s4);//abc
        System.out.println(s5);//wbc
    }
}
