import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 9:19
 */
public class Demo8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("窗体");
        JPanel panel = new JPanel();
        frame.add(panel);
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,0,30);
        panel.setLayout(flowLayout);
        panel.add(new JButton("按钮1"));
        panel.add(new JButton("按钮2"));
        panel.add(new JButton("按钮3"));
        panel.add(new JButton("按钮4"));
        Demo2.initFrame(frame,300,300);
    }
}
