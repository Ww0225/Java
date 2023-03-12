public class CirclTest {
    public static void main(String[] args) {
        Cirle c1 = new Cirle();
        c1.radius = 2.1;
        System.out.println(c1.Area());
    }
}
class Cirle{
    double radius;
    public double Area()
    {
        double area = 3.14 * radius * radius;
        return area;
    }
}