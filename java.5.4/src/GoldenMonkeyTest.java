/**
 * （1）定义一个接口Valuable（值钱的东西），
 *      该接口中有一个抽象方法getMoney()，该方法表示值多少钱；
 * （2）定义另一个接口Protectable（受保护的东西），
 *      该接口中有一个抽象方法beProtected()，该方法表示怎么被保护。
 * （3）定义一个抽象类Animal，该类中有成员变量name,tizhong
 *      还有一个抽象方法enjoy()，该方法表示动物的爱好。
 * （4）定义一个GoldenMonkey类，该类继承Animal类，并同时实现了Valuable、Protectable接口。
 *      enjoy()方法实现：输出“GoldenMonkey喜欢吃香蕉”；
 *      getMoney()方法实现：GoldenMonkey卖10000元每斤；
 *      beProtected()方法实现：GoldenMonkey住在房间里。
 * （5）定义一个GoldenMonkey对象，并实现它的所有方法的输出。
 *
 * @author 28953
 * @create 2023-05-04 15:31
 */
public class GoldenMonkeyTest {
    public static void main(String[] args) {
        GoldenMonkey goldenMonkey = new GoldenMonkey("猴子", 58.8);
        goldenMonkey.enjoy();
        goldenMonkey.beProtected();
        goldenMonkey.getMoney();
    }
}
interface Valuable{
    public abstract void getMoney();//该方法表示值多少钱
}
interface Protectable{
    public abstract void beProtected();//该方法表示怎么被保护
}
abstract class Animal{
    String name;//名字
    double tizhong;//体重
    public Animal(String name, double tizhong) {
        this.name = name;
        this.tizhong = tizhong;
    }
    public abstract void enjoy();//该方法表示动物的爱好
}
class GoldenMonkey extends Animal implements Valuable,Protectable{

    public GoldenMonkey(String name, double tizhong) {
        super(name, tizhong);
    }
    @Override
    public void enjoy() {
        System.out.println("GoldenMonkey喜欢吃香蕉");
    }
    @Override
    public void getMoney() {
        System.out.println("GoldenMonkey卖10000元每斤");
    }
    @Override
    public void beProtected() {
        System.out.println("GoldenMonkey住在房间里");
    }
}
