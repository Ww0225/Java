import java.util.Scanner;

/**
 * @author 28953
 * @create 2023-05-04 22:59
 */
public class FacTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Fac fac = new Fac();
        try {
            int total = fac.faci(n);
            System.out.println(n+"的阶乘为:"+total);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fac extends Exception{
    private int S=1;
    public int faci(int n) throws Exception {
        if(n>0){
            for(int i=1;i<=n;i++)
                S*=i;
            return S;
        }
        else{
            throw new Exception("n的值不能等于0");
        }
    }
}