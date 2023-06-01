import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 28953
 * @create 2023-06-01 12:46
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet1 = InetAddress.getByName("www.baidu.com");
        System.out.println(inet1);
        System.out.println(inet1.getHostAddress());
        System.out.println(inet1.getHostName());
    }
}
