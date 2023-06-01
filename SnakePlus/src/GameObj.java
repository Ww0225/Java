import java.awt.*;

/**
 * @author 28953
 * @create 2023-05-31 10:59
 */
public class GameObj {
    //是否存活
    boolean isLiving = true;
    //图片
    Image img;
    //坐标
    int x;
    int y;
    //宽高
    int width = 25;
    int height = 25;
    //窗口类的使用
    MainFrame frame;

    public GameObj() {
    }

    public Image getImg() {

        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public MainFrame getFrame() {
        return frame;
    }

    public void setFrame(MainFrame frame) {
        this.frame = frame;
    }

    public GameObj(Image img, int x, int y, int width, int height, MainFrame frame) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.frame = frame;
    }

    public GameObj(Image img, int x, int y, MainFrame frame) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.frame = frame;
    }

    //绘制自身
    public void paintSelf(Graphics g){
        g.drawImage(img,x,y,null);
    }
}
