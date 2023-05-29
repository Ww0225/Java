import javax.swing.*;
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-29 9:43
 */
public class Demo11 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("计算器");
        GridLayout gridLayout = new GridLayout(4,4,1,2);
        jFrame.setLayout(gridLayout);
        for(int i = 0;i<10;i++){
            jFrame.add(new Button(i+""));
        }
        jFrame.add(new Button("+"));
        jFrame.add(new Button("-"));
        jFrame.add(new Button("*"));
        jFrame.add(new Button("/"));
        jFrame.add(new Button("="));
        jFrame.add(new Button("."));
        Demo2.initFrame(jFrame,300,300);

    }
}
