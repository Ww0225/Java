/**
 * 假设有一个鸭子接口，拥有一个抽象方法游泳swim，
 * 另外有类（真鸭、机械鸭、橡皮鸭、木头鸭）实现了该接口。
 * 并且真鸭会游泳，机械鸭靠动力游泳，橡皮鸭靠浮力漂浮，木头鸭不会游泳，
 * 请根据每种鸭子特点重写swim方法。
 * 请你编写一个程序，实现在测试类中实例化这四种鸭子，并输出对应的数据。
 *
 * @author 28953
 * @create 2023-05-04 16:25
 */
public class ImplementsTest {
    public static void main(String[] args) {
        realDuck realDuck = new realDuck();
        mechanicalDuck mechanicalDuck = new mechanicalDuck();
        rubberDuck rubberDuck = new rubberDuck();
        woodenDuck woodenDuck = new woodenDuck();
        realDuck.swim();
        mechanicalDuck.swim();
        rubberDuck.swim();
        woodenDuck.swim();
    }
}
interface Duck{
    abstract public void swim();
}
class realDuck implements Duck{
    @Override
    public void swim() {
        System.out.println("真鸭会游泳");
    }
}
class mechanicalDuck implements Duck{
    @Override
    public void swim() {
        System.out.println("机械鸭靠动力游泳");
    }
}
class rubberDuck implements Duck{
    @Override
    public void swim() {
        System.out.println("橡皮鸭靠浮力游泳");
    }
}
class woodenDuck implements Duck{
    @Override
    public void swim() {
        System.out.println("木头鸭不会游泳");
    }
}