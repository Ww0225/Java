import java.io.Serializable;

/**
 * @author 28953
 * @create 2023-06-05 9:04
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;
    private void breath(){
        System.out.println("生物呼吸");
    }
    public void eat(){
        System.out.println("生物吃东西");
    }
}
