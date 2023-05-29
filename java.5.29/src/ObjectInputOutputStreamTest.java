import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流的使用
 * 1.ObjectInputStream 和 ObjectOutputStream
 * 2.作用：用于存储和读取基本数据类型数据或对象的处理流
 *          它的强大之处就是可以把java中的对象序列化
 * 3.要想一个java对象是可序列化的，需要满足相应的要求，见Person.java
 *
 *
 * @author 28953
 * @create 2023-05-29 16:27
 */
public class ObjectInputOutputStreamTest {
    public static void main(String[] args) {
        //序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
        //使用ObjectOutputStream实现
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.data"));
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();//刷新操作
            oos.writeObject(new Person("Tom",14));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
