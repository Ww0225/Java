public class TirAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.4);
        System.out.println("base:" + t1.getBase() + ",height:" + t1.getHeight());
        TriAngle t2 = new TriAngle(5.1,5.2);
        System.out.println("base:" + t1.getBase() + ",height:" + t1.getHeight());
        System.out.println(t2.Area(t2.getBase(),t2.getHeight()));
    }
}
