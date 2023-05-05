/**
 * 将一个字符串进行反转。将字符串中指定部分进行反转。
 * 比如"abcdefg"反转为"abfedcg"
 *
 * @author 28953
 * @create 2023-05-05 18:07
 */
public class ReverseTest {
    public static void main(String[] args) {
        ReverseTest reverseTest = new ReverseTest();
        String str1 = "abcdef";
        String str2 = reverseTest.reverse(str1, 1, 4);
        System.out.println(str2);
    }

    //方式一：转换为 char[]
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char ch;
                ch = arr[x];
                arr[x] = arr[y];
                arr[y] = ch;
            }
            return new String(arr);
        } else {
            return null;
        }
    }

    //方式二：使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if(str!=null && str.length()!=0){
            String reverseStr = str.substring(0,startIndex);
            for(int i = endIndex;i>=startIndex;i--){
                reverseStr += str.charAt(i);
            }
            reverseStr += str.substring(startIndex+1);
            return reverseStr;
        }else{
            return null;
        }
    }
    //方式三：使用StringBuffer/StringBuilder 替换String
    public String reverse2(String str, int startIndex, int endIndex){
        if(str!=null && str.length()!=0){
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0,startIndex));
            for(int i = endIndex;i>=startIndex;i--){
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex+1));
            return builder.toString();
        }else{
            return null;
        }
    }
}