/**
 * @author 28953
 * @create 2023-04-27 11:33
 */
public class StringMethodTest2 {
    public static void main(String[] args) {
        String s1 = "helloworld";
        boolean b1 = s1.endsWith("ld");
        System.out.println(b1);
        boolean b2 = s1.startsWith("He");
        System.out.println(b2);
        boolean b3 = s1.startsWith("llo",2);
        System.out.println(b3);
        String s2 = "wo";
        System.out.println(s1.contains(s2));
        System.out.println(s1.indexOf("lo"));
        System.out.println(s1.indexOf("lol"));
        String s3 = "hellorworld";
        System.out.println(s1.indexOf("lo",4));
        System.out.println(s3.lastIndexOf("or"));
        System.out.println(s3.lastIndexOf("or",6));

    }
}
