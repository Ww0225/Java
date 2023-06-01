import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 28953
 * @create 2023-06-01 15:36
 */
public class TCPTest1 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8888);
            outputStream = socket.getOutputStream();
            outputStream.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(socket!=null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket!=null)
                 outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //服务端
    @Test
    public void server() {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            ss = new ServerSocket(8888);
            socket = ss.accept();
            is = socket.getInputStream();
            //不建议这样写
        /*byte[] bytes = new byte[20];
        int len;
        while((len=is.read(bytes))!=-1){
            String str = new String(bytes,0,len);
            System.out.print(str);
            }*/
            baos = new ByteArrayOutputStream();
            byte[] bytes = new byte[5];
            int len;
            while((len=is.read(bytes))!=-1){
                baos.write(bytes,0,len);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(baos!=null)
                    baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null)
                 is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket!=null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(ss!=null)
                 ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
