import java.io.*;

/**
 * 处理流之一：缓冲流的使用
 *
 * 1.缓冲流：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 *
 * 2.作业：提高流的读取、写入的速度
 *   原因：内部提供了缓冲区
 *
 *
 * @author 28953
 * @create 2023-05-27 9:09
 */
public class BufferedTest {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("C:\\Users\\28953\\IdeaProjects\\java.5.27\\R-C.jpg");
            File destFile = new File("C:\\Users\\28953\\IdeaProjects\\java.5.27\\保时捷.jpg");
            //1.造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.读取写入
            byte[] bytes = new byte[10];
            int len;
            while((len = bis.read(bytes))!=-1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bis!=null)
                     bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos!=null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
