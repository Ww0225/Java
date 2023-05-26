import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 28953
 * @create 2023-05-26 17:29
 */
public class FileReaderWriterTest {
    public static void main(String[] args){
        FileReader fr = null;
        try {
            //将java.5.26下的hello.txt文件内容读入程序中，并输出到控制台
            File file = new File("C:\\Users\\28953\\IdeaProjects\\java.5.26\\hello");
            fr = new FileReader(file);
            //read():返回读入的一个字符，如果达到文件末尾，返回-1
            int data = fr.read();
            while(data!=-1){
                System.out.print((char)data);
                data=fr.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fr!=null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
