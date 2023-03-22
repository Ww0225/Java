package com.company;

public class Cylinder extends Circle{
    private double length;
    public Cylinder()
    {
        length = 1.0;
    }
    public double findVolume()//计算圆柱体积
    {
        return length * findArea();
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
