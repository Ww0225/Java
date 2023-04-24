/**
 * @author 28953
 * @create 2023-04-24 16:51
 */
public class DuoTaiTest {
    public static void main(String[] args) {
        Persion p1 = new Student();
        p1.work();
        Persion p2 = new Teacher();
        p2.work();
    }
}
class Persion{
    String name;
    int age;
    public void work(){
        System.out.println("他正在工作！");
    }
}
class Student extends Persion{
    public void work(){
        System.out.println("他正在学习！");
    }
}
class Teacher extends Persion{
    public void work(){
        System.out.println("他正在授课!");
    }
}
