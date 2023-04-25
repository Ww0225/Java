/**
 * @author 28953
 * @create 2023-04-25 9:43
 */
public class DuoTaiTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog(18,"男","小白"),
                                        new Cat(17,"女","小黄"),
                                        new Mouse(16,"男","小黑")};
        for(int i = 0;i<animals.length;i++)
        {
            if(animals[i] instanceof Dog){
                Dog dog = (Dog)animals[i];
                System.out.println(dog.getName()+" "+dog.getSex()+" "+dog.getAge());
                dog.eat();
            }else if(animals[i] instanceof Cat){
                Cat cat = (Cat)animals[i];
                System.out.println(cat.getName()+" "+cat.getSex()+" "+cat.getAge());
                cat.eat();
            }else if(animals[i] instanceof Mouse){
                Mouse mouse = (Mouse)animals[i];
                System.out.println(mouse.getName()+" "+mouse.getSex()+" "+mouse.getAge());
                mouse.eat();
            }else{
                System.out.println("Program Error!");
            }
        }
    }
}
class Animal{
    private int age;
    private String sex;
    private String name;
    public void eat(){
        System.out.println("Animal eating...");
    }

    public Animal(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }
}
class Dog extends Animal{
    public Dog(int age, String sex, String name) {
        super(age, sex, name);
    }
    @Override
    public void eat() {
        System.out.println("Dog eating....");
    }
}
class Cat extends Animal{
    public Cat(int age, String sex, String name) {
        super(age, sex, name);
    }
    @Override
    public void eat() {
        System.out.println("Cat eating....");
    }
}
class Mouse extends Animal{
    public Mouse(int age, String sex, String name) {
        super(age, sex, name);
    }

    @Override
    public void eat() {
        System.out.println("Mouse eating....");
    }
}
