import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 28953
 * @create 2023-05-26 22:30
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            //1.造文件
            File file = new File("C:\\Users\\28953\\IdeaProjects\\java.5.26\\hello");
            //2.造流
            fis = new FileInputStream(file);
            //3.读数据
            byte[] bytes = new byte[5];
            int len;
            while((len = fis.read(bytes))!=-1){
                String str = new String(bytes,0,len);
                System.out.print(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.关闭资源
            try {
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}