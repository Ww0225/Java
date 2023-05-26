import java.io.File;
import java.io.IOException;

/**
 * @author 28953
 * @create 2023-05-26 14:20
 */
public class FileExer {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Java\\Code\\io\\hello.txt");
        //创建一个与file同目录下的另外一个文件，文件名为：haha.txt
        File destFile = new File(file.getParent(),"haha.txt");
        boolean newFile = destFile.createNewFile();
        if(newFile){
            System.out.println("创建成功");
        }
    }
}
