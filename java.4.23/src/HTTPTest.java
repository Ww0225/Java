import java.util.Scanner;

/**
 * KiKi访问网站，得到HTTP状态码，但他不知道什么含义，BoBo老师告诉他常见HTTP状态码：200（OK，请求已成功），202（Accepted，服务器已接受请求，但尚未处理。）400（Bad Request，请求参数有误），403（Forbidden，被禁止），404（Not Found，请求失败），500（Internal Server Error，服务器内部错误），502（Bad Gateway，错误网关）。
 *
 * 输入描述：
 * 多组输入，一行，一个整数（100~600），表示HTTP状态码。
 * 输出描述：
 * 针对每组输入的HTTP状态，输出该状态码对应的含义，具体对应如下：
 * 200-OK
 * 202-Accepted
 * 400-Bad Request
 * 403-Forbidden
 * 404-Not Found
 * 500-Internal Server Error
 * 502-Bad Gateway
 *
 * @author 28953
 * @create 2023-04-23 19:18
 */
public class HTTPTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int number = in.nextInt();
            switch (number) {
                case 200:
                    System.out.println("OK");
                    break;
                case 202:
                    System.out.println("Accepted");
                    break;
                case 400:
                    System.out.println("Bad Request");
                    break;
                case 403:
                    System.out.println("Forbidden");
                    break;
                case 404:
                    System.out.println("Not Found");
                    break;
                case 500:
                    System.out.println("Internal Server Error");
                    break;
                case 502:
                    System.out.println("Bad Gateway");
                    break;
            }
        }
    }
}
