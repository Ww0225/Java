package com.company;

public class Circle {
    private double radius;
    public Circle()
    {
        radius = 1.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double findArea()//计算圆的面积
    {
        return Math.PI * radius * radius;
    }
}
