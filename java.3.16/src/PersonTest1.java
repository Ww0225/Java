public class PersonTest1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        Person p1 = new Person("Tom");
        System.out.println(p1.name);
    }
}
class Person{
    String name;
    int age;
    public void eat()
    {
        System.out.println("人吃饭");
    }
    public void study()
    {
        System.out.println("人学习");
    }
    //构造器
    public Person()
    {
        System.out.println("Person()...");
    }
    public Person(String n)
    {
        name = n;
    }
    public Person(String n,int a)
    {
        name = n;
        age = a;
    }
}
