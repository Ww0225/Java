import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 28953
 * @create 2023-05-31 7:45
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.5.31");
            System.out.println(inetAddress);
            InetAddress inetAddress1 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inetAddress1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
