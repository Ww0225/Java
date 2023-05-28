import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 28953
 * @create 2023-05-28 10:51
 */
public class PicTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //图片的加密
            fis = new FileInputStream("C:\\Users\\28953\\IdeaProjects\\java.5.28\\保时捷.jpg");
            fos = new FileOutputStream("C:\\Users\\28953\\IdeaProjects\\java.5.28\\保时捷secret.jpg");
            byte[] bytes = new byte[20];
            int len;
            while((len = fis.read(bytes))!=-1){
                //字节数组进行修改
                for(int i = 0;i<len;i++){
                    bytes[i] = (byte) (bytes[i]^5);
                }
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
