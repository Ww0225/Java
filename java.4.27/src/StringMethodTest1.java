/**
 * @author 28953
 * @create 2023-04-27 8:34
 */
public class StringMethodTest1 {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3 = "abc";
        String s4 = "def";
        String s5 = s3.concat(s4);
        System.out.println(s5);
        String s6 = "abc";
        String s7 = "abf";
        System.out.println(s6.compareTo(s7));
        String s8 = "北京欢迎你";
        String s9 = s8.substring(2);
        System.out.println(s8);
        System.out.println(s9);
        String s10 = s8.substring(0,2);
        System.out.println(s10);
    }
}
