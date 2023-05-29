import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 9:13
 */
public class Demo7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("边框局部管理器");
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);
        frame.add(new JButton("北"),BorderLayout.NORTH);
        frame.add(new JButton("南"),BorderLayout.SOUTH);
        frame.add(new JButton("西"),BorderLayout.WEST);
        frame.add(new JButton("东"),BorderLayout.EAST);
        frame.add(new JButton("中"),BorderLayout.CENTER);
        Demo2.initFrame(frame,300,300);

    }
}
