public class TriAngle {
    private double base;
    private double height;

    public TriAngle(){}
    public TriAngle(double b,double h)
    {
        base = b;
        height = h;
    }
    public double Area(double b,double h)
    {
        return 1.0 / 2 * b * h;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
