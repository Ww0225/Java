import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 28953
 * @create 2023-06-01 18:31
 */
public class TCPTest {
    @Test
    public void client()throws IOException{
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os = socket.getOutputStream();
        FileInputStream fis =
                new FileInputStream(
                        new File("C:\\Users\\28953\\IdeaProjects\\java.6.1\\保时捷.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        //接收反馈
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[20];
        int len1;
        while((len1=is.read(bytes1))!=-1){
            baos.write(bytes1,0,len1);
        }
        System.out.println(baos.toString());
        fis.close();
        os.close();
        socket.close();
        baos.close();
    }
    @Test
    public void server()throws IOException{
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("保时捷1.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //反馈
        OutputStream os = socket.getOutputStream();
        os.write("你好，已收到".getBytes());

        fos.close();
        socket.close();
        ss.close();
        os.close();
    }
}
