import java.util.Random;

/**
 * @author 28953
 * @create 2023-05-30 13:18
 */
public class Food extends Node {
        public Food(){
            reset();
        }
        public void reset(){
            //创建Random对象
            Random random = new Random();
            //随机生成横坐标
            setX(random.nextInt(40));
            //随机生成纵坐标
            setY(random.nextInt(40));
        }
}
