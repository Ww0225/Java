import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 28953
 * @create 2023-05-26 18:13
 */
public class FileReaderTest1 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File file = new File("C:\\Users\\28953\\IdeaProjects\\java.5.26\\hello");
            fr = new FileReader(file);
            char[] chars = new char[5];
            int len;
            while((len = fr.read(chars))!=-1){
                for(int i = 0;i<len;i++){
                    System.out.print(chars[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
