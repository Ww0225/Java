/**
 * @author 28953
 * @create 2023-04-24 17:01
 */
public class Demo2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.name = "小黑";
        System.out.println(animal.name);
    }
}
class Animal{
    String name;
    int age;
}
class Dog extends Animal{
    String colors;
}
