package com.company;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }

}
interface Attackable{
    void attack();
}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 1;
    public abstract void fly();
    void stop();
}
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Plane fly");
    }

    @Override
    public void stop() {
        System.out.println("Plane stop");
    }
}
class Bullet implements Flyable,Attackable{

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

