/**
 * String --> 基本数据类型   parseXxx(str)
 * 基本数据类型 --> String   valueof(xxx)
 * @author 28953
 * @create 2023-04-27 15:54
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "123";
        int num = Integer.parseInt(s1);
        String s2 = String.valueOf(num);
    }
}
