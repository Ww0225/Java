import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 28953
 * @create 2023-05-29 22:02
 */
public class RandomAccessFileTest1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile
                ("C:\\Users\\28953\\IdeaProjects\\java.5.29\\src\\hello1.txt","rw");
        raf1.write("xyz".getBytes());
        raf1.close();
    }
}
