import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 28953
 * @create 2023-06-01 18:17
 */
public class TCPTest2 {
    //例题2：客户端发送文件给服务端，服务端将文件保存在本地
    @Test
    public void client() throws IOException {
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
        fis.close();
        os.close();
        socket.close();
    }
    @Test
    public void server() throws  IOException{
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("保时捷2.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        socket.close();
        ss.close();
    }

}
