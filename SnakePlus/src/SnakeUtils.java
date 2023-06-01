
import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-31 9:48
 */
public class SnakeUtils {
    //蛇头
    public static Image upImag =
            Toolkit.getDefaultToolkit()
                    .getImage("C:\\Users\\28953\\IdeaProjects\\SnakePlus\\up.png");
    public static Image downImag =
            Toolkit.getDefaultToolkit()
                    .getImage("C:\\Users\\28953\\IdeaProjects\\SnakePlus\\down.png");
    public static Image leftImag =
            Toolkit.getDefaultToolkit()
                    .getImage("C:\\Users\\28953\\IdeaProjects\\SnakePlus\\left.png");
    public static Image rightImag =
            Toolkit.getDefaultToolkit()
                    .getImage("C:\\Users\\28953\\IdeaProjects\\SnakePlus\\right.png");
    //蛇身
    public static Image bodyImag =
            Toolkit.getDefaultToolkit()
                    .getImage("C:\\Users\\28953\\IdeaProjects\\SnakePlus\\body.png");
    //食物
    public static Image foodImag =
            Toolkit.getDefaultToolkit()
                    .getImage("C:\\Users\\28953\\IdeaProjects\\SnakePlus\\food.png");
    //关卡
    public static int level=1;
    //绘制文字
    public static void drawWrod(Graphics g,String str,Color color,int size,int x,int y){
        g.setColor(color);
        g.setFont(new Font("仿宋",Font.BOLD,size));
        g.drawString(str,x,y);
    }
}
