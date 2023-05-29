import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 9:23
 */
public class Demo9 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("窗体");
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        jFrame.add(panel);
        Demo2.initFrame(jFrame,400,300);
    }
}
