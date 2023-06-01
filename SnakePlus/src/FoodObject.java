import java.awt.*;
import java.util.Random;

/**
 * @author 28953
 * @create 2023-05-31 14:38
 */
public class FoodObject extends GameObj{
    //随机
    Random random = new Random();

    public FoodObject() {

    }

    //随机获取食物
    public FoodObject getFood(){
        return new FoodObject
                (SnakeUtils.foodImag,random.nextInt(24)*25,
                        (random.nextInt(23)+1)*25,this.frame);
    }
    public FoodObject(Image img, int x, int y, MainFrame frame) {
        super(img, x, y, frame);
    }

    @Override
    public void paintSelf(Graphics g) {
        super.paintSelf(g);
    }
}
