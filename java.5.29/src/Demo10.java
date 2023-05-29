import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 28953
 * @create 2023-05-29 9:36
 */
public class Demo10 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("窗体");
        JButton jButton = new JButton("点我啊！");
        jFrame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("哎呀被点了");
                JButton button = (JButton) e.getSource();
                if(button.getText().equals("点我啊！")){
                    button.setText("点他吧！");
                }else{
                    button.setText("点我啊！");
                }
            }
        });
        Demo2.initFrame(jFrame,400,400);
    }
}
