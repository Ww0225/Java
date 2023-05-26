import java.io.File;

/**
 * isDirectory():判断是否是文件目录
 * isFile():判断是否是文件
 * exists():判断是否可读
 * canRead():判断是否可写
 * isHidden():判断是否隐藏
 *
 * @author 28953
 * @create 2023-05-26 9:13
 */
public class FileTest1 {
    public static void main(String[] args) {
        File file1 = new File("hello");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
}
