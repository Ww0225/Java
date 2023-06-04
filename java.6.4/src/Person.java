/**
 * @author 28953
 * @create 2023-06-04 19:32
 */
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int age;

    private  String showNation(String nation){
        System.out.println("我的国籍是："+nation);
        return nation;
    }
    public void show(){
        System.out.println("我是一个人");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person() {

    }
    private Person(String name) {

        this.name = name;
    }
}
