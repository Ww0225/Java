import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RandomAccessFile实现插入效果
 * @author 28953
 * @create 2023-05-30 16:27
 */
public class RandomAccessFileTest1 {
    public static void main(String[] args) {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile
                    ("C:\\Users\\28953\\IdeaProjects\\java.5.30\\hello.txt","rw");
            raf1.seek(3);
            StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
            byte[] bytes = new byte[20];
            int len;
            while((len = raf1.read(bytes))!=-1){
                builder.append(new String(bytes,0,len));
            }
            //调回指针，写入"xyz"
            raf1.seek(3);
            raf1.write("xyz".getBytes());
            raf1.write(builder.toString().getBytes());
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
