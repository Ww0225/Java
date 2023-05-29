import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 28953
 * @create 2023-05-29 21:42
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(
                    new File("C:\\Users\\28953\\IdeaProjects\\java.5.29\\R-C.jpg"),"r");
            raf2 = new RandomAccessFile(
                    new File("C:\\Users\\28953\\IdeaProjects\\java.5.29\\R-C1.jpg"),"rw");
            byte[] bytes = new byte[1024];
            int len;
            while((len = raf1.read(bytes))!=-1){
                raf2.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(raf1!=null)
                    raf1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(raf2!=null)
                    raf2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
