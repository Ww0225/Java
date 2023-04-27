/**
 * 关于StringBuffer和StringBuilder的使用 --- 可变的字符序列
 *
 * @author 28953
 * @create 2023-04-27 18:13
 */
public class StringBufferBuilderTest {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);
    }
}
