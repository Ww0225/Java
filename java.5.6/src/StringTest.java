/**
 * 、编写一个程序，实现字符串大小的转换并倒序输出，要求如下：
 *   (1)、使用for循环将字符串“HelloWorld”从最后一个字符开始遍历。
 *   (2)、遍历的当前字符如果是大写字母，
 *        就使用toLowerCase()方法将其转换为小写字母，
 *        反之则使用toUpperCase方法将其转换为大写字母。
 *   (3)、定义一个StringBuffer对象，
 *        调用append()方法依次添加遍历的字符，
 *        最后调用StringBuffer对象的toString()方法，
 *        并将得到的结果输出。
 *
 * @author 28953
 * @create 2023-05-06 14:55
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "HelloWorld";
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                stringBuffer.append(Character.toUpperCase(ch));
            }else{
                stringBuffer.append(Character.toLowerCase(ch));
            }
        }
        String reverse = stringBuffer.toString();
        System.out.println(reverse);
    }
}
