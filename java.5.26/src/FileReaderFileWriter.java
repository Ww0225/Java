import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 28953
 * @create 2023-05-26 21:57
 */
public class FileReaderFileWriter {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            File srcFile = new File("C:\\Users\\28953\\IdeaProjects\\java.5.26\\hello");
            File destFile = new File("C:\\Users\\28953\\IdeaProjects\\java.5.26\\hello1.txt");
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);
            char[] chars = new char[5];
            int len;
            while((len=fr.read(chars))!=-1){
                fw.write(chars,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fr!=null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fw!=null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
