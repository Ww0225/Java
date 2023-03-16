import com.company.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(18);
        System.out.println("年龄为:" + p1.getAge());
        Person p2 = new Person("Tom",21);
        System.out.println("年龄为：" + p2.getAge());
    }
}
