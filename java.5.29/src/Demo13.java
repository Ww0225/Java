import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author 28953
 * @create 2023-05-29 14:25
 */
public class Demo13 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("鼠标事件监听器");
        JButton button = new JButton("按钮");
        jFrame.add(button);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标单击...");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按下...");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标松开...");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标进入...");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标移出...");
            }
        });
        Demo2.initFrame(jFrame,300,300);
    }
}
