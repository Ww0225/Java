import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 8:53
 */
public class Demo5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("窗体");
        FileDialog fileDialog = new FileDialog(frame,"请选择保存的路径",FileDialog.SAVE);
        Demo2.initFrame(frame,300,400);
        fileDialog.setVisible(true);
        System.out.println("文件所在目录："+fileDialog.getDirectory());
        System.out.println("文件名:"+fileDialog.getFile());
    }
}
