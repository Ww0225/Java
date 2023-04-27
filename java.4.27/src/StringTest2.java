import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * String --> byte[] 调用String的getBytes()
 * @author 28953
 * @create 2023-04-27 16:16
 */
public class StringTest2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "abc123中国";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = s1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));
        System.out.println();
        String s2 = new String(bytes);
        System.out.println(s2);
        String s3 = new String(gbks);
        System.out.println(s3);
    }
}
