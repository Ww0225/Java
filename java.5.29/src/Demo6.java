import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 8:59
 */
public class Demo6 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("记事本");
        JMenuBar bar = new JMenuBar();
        jFrame.add(bar,BorderLayout.NORTH);
        JMenu fileMenu = new JMenu("文件");
        JMenu editMenu = new JMenu("编辑");
        bar.add(fileMenu);
        bar.add(editMenu);
        JMenuItem openMenu = new JMenuItem("打开");
        JMenuItem saveMenu = new JMenuItem("保存");
        JMenuItem copyMenu = new JMenuItem("复制");
        JMenuItem cutMenu = new JMenuItem("剪切");
        JMenu switchMenu = new JMenu("切换工作目录");
        fileMenu.add(openMenu);
        fileMenu.add(saveMenu);
        editMenu.add(copyMenu);
        editMenu.add(cutMenu);
        fileMenu.add(switchMenu);
        JMenuItem workMenu1 = new JMenuItem("project1");
        JMenuItem workMenu2 = new JMenuItem("project2");
        JMenuItem workMenu3 = new JMenuItem("project3");
        JTextArea area = new JTextArea(20,30);
        jFrame.add(area);
        Demo2.initFrame(jFrame,500,600);

    }
}
