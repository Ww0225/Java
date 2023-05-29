import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 8:26
 */
public class Demo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是我的第一个图形化界面的例子");
        initFrame(frame,500,400);
    }

    public static void initFrame(JFrame frame, int width, int height) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        int x = (int)d.getWidth();
        int y = (int)d.getHeight();
        frame.setBounds((x-width)/2,(y-height)/2,width,height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
