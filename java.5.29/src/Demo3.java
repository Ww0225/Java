import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 8:33
 */
public class Demo3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("窗口");
        JDialog jDialog = new JDialog(jFrame,"这是第一个对话框的例子",true);
        initJDialog(jDialog,500,400);
        Demo2.initFrame(jFrame,500,400);
    }

    private static void initJDialog(JDialog jDialog, int width, int height) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        int x = (int)d.getWidth();
        int y = (int)d.getHeight();
        jDialog.setBounds((x-width)/2,(y-height)/2,width,height);
        jDialog.setVisible(true);
    }
}
