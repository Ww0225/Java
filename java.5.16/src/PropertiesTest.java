import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author 28953
 * @create 2023-05-17 21:17
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\28953\\IdeaProjects\\java.5.16\\src\\jdbc.properties");
        pros.load(fis);//加载流对应的文件
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println("name = "+name+",password = "+password);
    }
}
