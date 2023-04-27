/**
 * @author 28953
 * @create 2023-04-27 15:34
 */
public class StringMethodTest3 {
    public static void main(String[] args) {
        String s1 = "北京欢迎你-北京";
        String s2 = s1.replace("北","南");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        String s3 = "12hello34world5java7891mysql456";
        String s4 = s3.replaceAll("\\d+",",");
        System.out.println(s4);
        String s5 = s4.replaceAll("^,|,$","");
        System.out.println(s5);
        String s6 = "123456";
        boolean matches = s6.matches("\\d+");
        System.out.println(matches);
        String tel = "0571-4534289";
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);
        System.out.println();
        String s7 = "hello|world|java";
        String[] s7s = s7.split("\\|");
        for(int i = 0;i<s7s.length;i++)
        {
            System.out.println(s7s[i]);
        }
        System.out.println();
        String s8 = "hello.world.java";
        String[] s8s = s8.split("\\.");
        for(int i = 0;i<s8s.length;i++)
        {
            System.out.println(s8s[i]);
        }

    }
}
