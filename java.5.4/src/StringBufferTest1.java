/**
 * @author 28953
 * @create 2023-05-04 12:26
 */
public class StringBufferTest1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);
        //s1.delete(2,4);
        //s1.replace(2,4,"hello");
        //s1.insert(2,false);
        //s1.reverse();
        String s2 = s1.substring(1,3);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);

    }
}
