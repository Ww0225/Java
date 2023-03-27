package com.company;

public class Circle extends GeometricObject{
    private double radius;
    public Circle()
    {
        super();
        this.radius = 1.0;
    }
    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }
    public double findArea()//计算圆的面积
    {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj instanceof Circle)
        {
            Circle c = (Circle)obj;
            return this.radius == c.radius;
        }
        return false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }
}
