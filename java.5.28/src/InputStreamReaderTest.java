import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 处理流之二：
 * 1.转换流：属于字符流
 *  InputStreamReader：将一个字节的输入流转换为字符的输入流
 *  OutputStreamWriter：将一个字符的输出流转换为字节的输出流
 *
 * 2.作用：提供字节流与字符流之间的转换
 *
 *
 * @author 28953
 * @create 2023-05-28 11:55
 */
public class InputStreamReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while(true){
                System.out.print("请输入字符串：");
                String data = br.readLine();
                if("e".equalsIgnoreCase(data)){
                    System.out.println("Over");
                    break;
                }else{
                    String upperCase = data.toUpperCase();
                    System.out.println(upperCase);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
