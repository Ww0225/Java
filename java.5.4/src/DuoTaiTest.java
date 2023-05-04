/**
 * 假设有一个鸟类Bird，拥有属性name，还能发出鸣叫moo，
 * 另外有子类鹦鹉（Parrot）、燕子（Swallow）和麻雀（Sparrow）继承了Bird类，
 * 子类都重写了moo方法，分别发出了属于自身的鸣叫，
 * 有一个Person类，如果他想听鸟叫，那么你传给什么鸟声给他听，
 * 他就能听到什么鸟发出的叫声，请用多态实现。
 *
 * @author 28953
 * @create 2023-05-04 15:55
 */
public class DuoTaiTest {
    public static void main(String[] args) {
        Person person = new Person();
        Parrot parrot = new Parrot("zhangsan");
        Sparrow sparrow = new Sparrow("lisi");
        Swallow swallow = new Swallow("wangwu");
        person.listen(parrot);
        person.listen(sparrow);
        person.listen(swallow);
    }
}
class Person{
    public void listen(Bird bird){
        bird.moo();
    }
}
class Bird{
    String name;
    public Bird(String name) {
        this.name = name;
    }
    public void moo(){
        System.out.println(this.name+"叫");
    }
}
class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }
    @Override
    public void moo() {
        System.out.println(this.name+"叫");
    }
}
class Swallow extends Bird{
    public Swallow(String name) {
        super(name);
    }
    @Override
    public void moo() {
        System.out.println(this.name+"叫");
    }
}
class Sparrow extends Bird{
    public Sparrow(String name) {
        super(name);
    }
    @Override
    public void moo() {
        System.out.println(this.name+"叫");
    }
}