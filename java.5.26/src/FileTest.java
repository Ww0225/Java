import java.io.File;

/**
 * @author 28953
 * @create 2023-05-26 8:26
 */
public class FileTest {
    public static void main(String[] args) {
        File file1 = new File("hello");
        File file2 = new File("D:\\Java\\Code\\io\\hi.txt");
        //File(String filePath)
        //File(String parentPath,String childPath)
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println("*********************************");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());


    }
}
