import java.io.File;

/**
 * @author 28953
 * @create 2023-05-26 14:11
 */
public class FileTest3 {
    public static void main(String[] args) {
        File file1 = new File("D:\\Java\\Code\\io\\io1");
        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("创建成功");
        }

        File file2 = new File("D:\\Java\\Code\\io\\io2");
        boolean mkdirs = file2.mkdirs();
        if(mkdirs){
            System.out.println("创建成功1");
        }

    }
}
