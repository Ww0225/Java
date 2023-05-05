/**
 * @author 28953
 * @create 2023-05-05 22:16
 */
public class IDEADebug {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//"null"
        StringBuffer sb1 = new StringBuffer(str);//报异常
        System.out.println(sb1);
    }
}
