import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 28953
 * @create 2023-05-29 16:35
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        //反序列化:将磁盘文件中的对象还原为内存中的一个对象
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream
                    (new FileInputStream("C:\\Users\\28953\\IdeaProjects\\java.5.29\\object.data"));
            Object obj = ois.readObject();
            String str = (String) obj;
            Person p = (Person)ois.readObject();
            System.out.println(str);
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois!=null)
                 ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
