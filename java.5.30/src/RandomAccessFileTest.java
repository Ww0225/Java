import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 28953
 * @create 2023-05-30 16:19
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile
                    ("C:\\Users\\28953\\IdeaProjects\\java.5.30\\hello.txt","rw");
            raf1.seek("hello.txt".length()-1);
            raf1.write("xyz".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(raf1!=null)
                    raf1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
