/**
 * @author 28953
 * @create 2023-04-27 8:19
 */
public class StringMethodTest {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        for(int i = 0;i<s1.length();i++)
        {
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "   he  llo  wo  rld   ";
        String s4 = s3.trim();
        System.out.println("----"+s3+"----");
        System.out.println("----"+s4+"----");
    }
}
