import java.io.File;
import java.io.IOException;

/**
 * createNewFile():创建文件，若文件存在，则不创建，返回false
 * mkdir():创建文件目录，如果此文件目录存在，就不创建了，如果此文件目录的上层不存在，一并不创建
 * mkdirs():创建文件目录，如果上层文件目录不存在，一并创建
 * delete():删除文件或文件夹
 * @author 28953
 * @create 2023-05-26 9:26
 */
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else{//文件存在
            file1.delete();
            System.out.println("删除成功");
        }
    }
}
