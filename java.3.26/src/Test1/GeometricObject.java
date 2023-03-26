package Test1;

public class GeometricObject {
    protected String color;
    protected double weight;
    GeometricObject(String color,double weight)
    {
        super();
        this.color = color;
        this.weight = weight;
    }
    public double findArea()
    {
        return 0.0;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
