import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 28953
 * @create 2023-05-29 9:47
 */
public class Demo12 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("卡片布局管理器");
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        final CardLayout cardLayout = new CardLayout();
        jPanel.setLayout(cardLayout);
        JButton button = new JButton("黑桃A");
        jPanel.add(button);
        jPanel.add(new Button("红桃K"));
        jPanel.add(new Button("梅花6"));
        jPanel.add(new Button("方块2"));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e) {
                cardLayout.next(jPanel);
            }
        });
        Demo2.initFrame(jFrame,400,300);
    }
}
