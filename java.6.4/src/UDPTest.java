import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议的网络编程
 * @author 28953
 * @create 2023-06-04 14:58
 */
public class UDPTest {
    //发送端
    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        java.lang.String str = "我是UDP方式发送的导弹";
        InetAddress inetAddress = InetAddress.getLocalHost();
        byte[] data = str.getBytes();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,inetAddress,9090);
        socket.send(packet);
        socket.close();
    }
    //接收端
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] bytes = new byte[100];
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
        socket.receive(packet);
        String str = new String(packet.getData(),0,packet.getLength());
        System.out.println(str);
        socket.close();
    }
}
