import java.util.Scanner;

/**
 * @author 28953
 * @create 2023-04-28 22:11
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName = "admin";
        String passWord = "admin";
        while(in.hasNext()){
            String s1 = in.next();
            String s2 = in.next();
            if(s1.equals(userName)&&s2.equals(passWord)){
                System.out.println("Login Success!");
            }else{
                System.out.println("Login Fail!");
            }
        }
    }
}
