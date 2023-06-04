import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL网络编程
 * 1.URL：统一资源定位符，对应着互联网的某一资源地址
 * 2.格式：
 *  http://localhost:8080/examples/beauty.jpg?username=Tom
 *   协议   主机名   端口号   资源地址         参数列表
 *
 *
 * @author 28953
 * @create 2023-06-04 15:22
 */
public class URLTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/examples/beauty.jpg?username=Tom");
        //获取该URL的协议名
        System.out.println(url.getProtocol());
        //获取该URL的主机名
        System.out.println(url.getHost());
        //获取该URL的端口号
        System.out.println(url.getPort());
        //获取该URL的文件路径
        System.out.println(url.getFile());
        //获取该URL的查询名
        System.out.println(url.getQuery());
    }
}
