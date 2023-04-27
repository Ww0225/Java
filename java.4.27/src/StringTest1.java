/**
 *  String --> char[]  调用String的toCharArray()
 *  char[] --> String  调用String的构造器
 * @author 28953
 * @create 2023-04-27 16:03
 */
public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "abc123";
        char[] chars = s1.toCharArray();
        for(int i = 0;i<chars.length;i++)
        {
            System.out.println(chars[i]);
        }
        char[] arr = new char[]{'h','h','h'};
        String s2 = new String(arr);
        System.out.println(s2);
    }
}
