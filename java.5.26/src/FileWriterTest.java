import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 28953
 * @create 2023-05-26 21:42
 */
public class FileWriterTest {
    public static void main(String[] args) {
        //从内存中写出数据到硬盘的文件里
        FileWriter fw = null;
        try{
            File file = new File("C:\\Users\\28953\\IdeaProjects\\java.5.26\\hello");
            fw = new FileWriter(file);
            fw.write("I have a dream!\n");
            fw.write("you need to have a dream!");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fw!=null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
