/**
 * @author 28953
 * @create 2023-05-04 14:43
 */
public class Test1 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,5,5,5);
        System.out.println("轴心坐标为:"+"("+cylinder.x+","+cylinder.y+")");
        System.out.println("半径为:"+cylinder.r);
        System.out.println("高为:"+cylinder.h);
        System.out.println("面积为:"+cylinder.areaCylinder(cylinder.r,cylinder.h));

    }
}
class Point{
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Circle extends Point{
    double r;//半径
    public Circle(int x, int y,double r) {
        super(x, y);
        this.r = r;
    }
    public double areaCircle(double r){
        return Math.PI*r*r;
    }
}
class Cylinder extends Circle{
    double h;//高
    public Cylinder(int x, int y, double r,double h) {
        super(x, y, r);
        this.h = h;
    }
    public double areaCylinder(double r,double h){
        return Math.PI*r*r*h;
    }
}