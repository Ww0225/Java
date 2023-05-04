/**
 * @author 28953
 * @create 2023-05-04 15:00
 */
public class Test2 {
    public static void main(String[] args) {
        Car car = new Car(130,"car","blue",5);
        Bus bus = new Bus(60,"bus","blank",30);
        car.show();
        car.run();
        bus.show();
        bus.run();
    }
}
abstract class Vehicle{
    double speed;//速度
    String kind;//类别
    String color;//颜色
    public Vehicle(double speed, String kind, String color) {
        this.speed = speed;
        this.kind = kind;
        this.color = color;
    }
    public abstract void show();
    public abstract void run();
}
class Car extends Vehicle{
    int passenger;
    public Car(double speed, String kind, String color, int passenger) {
        super(speed, kind, color);
        this.passenger = passenger;
    }
    @Override
    public void show() {
        System.out.println("I am a"+kind+",color:"+color+",passenger:"+passenger);
    }
    @Override
    public void run() {
        System.out.println("My speed is:"+speed);
    }
}
class Bus extends Vehicle{
    int passenger;

    public Bus(double speed, String kind, String color, int passenger) {
        super(speed, kind, color);
        this.passenger = passenger;
    }

    @Override
    public void show() {
        System.out.println("I am a"+kind+",color:"+color+",passenger:"+passenger);
    }

    @Override
    public void run() {
        System.out.println("My speed is:"+speed);
    }
}
