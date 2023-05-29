import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 8:40
 */
public class Demo4 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("窗体");
        Demo2.initFrame(jFrame,300,400);
        JOptionPane.showMessageDialog(jFrame,"明天不用上课","通知",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(jFrame,"警告同学上课不要睡觉","警告",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(jFrame,"扣6分","错误",JOptionPane.ERROR_MESSAGE);
        String money = JOptionPane.showInputDialog("请输入你要给我的金额(MYM)");
        System.out.println("money:"+money);
        int num = JOptionPane.showConfirmDialog(jFrame,"你确认要卸载吗？");
        System.out.println(num);
    }
}
