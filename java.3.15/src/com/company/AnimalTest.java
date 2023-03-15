package com.company;
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal() ;
        //animal.name = "大黄";
        //animal.age = 1;
        //animal.legs = 4;
        animal.setName("大黄");
        animal.getName();
        animal.setAge(1);
        animal.getAge();
        animal.setLegs(6);
        animal.getLegs();
        animal.show();
    }
}
class Animal{
    private String name;
    private int age;
    private int legs;//腿的个数
    public void setLegs(int l)
    {
        if(l >= 0 && l % 2== 0)
        {
            legs = l;
        }
        else
        {
            legs = 0;
        }
    }
    public int getLegs() {
        return legs;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat()
    {
        System.out.println("动物进食");
    }
    public void show()
    {
        System.out.println("name = " + name + " age = " + age + " legs = " + legs);
    }
}
