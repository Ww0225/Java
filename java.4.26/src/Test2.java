/**
 * @author 28953
 * @create 2023-04-26 10:12
 */
public class Test2 {
    public static void main(String[] args) {
        String s1 = "javaEE";
        String s2 = "javaEE";
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//false+
        System.out.println();
        Person p1 = new Person("Tom",18);
        Person p2 = new Person("Tom",18);
        System.out.println(p1.name == p2.name);//true
        System.out.println(p1.name.equals(p2.name));//true
        p1.name = "Jerry";
        System.out.println(p2.name);
    }
}
class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
