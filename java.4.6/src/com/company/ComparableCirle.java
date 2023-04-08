package com.company;

public class ComparableCirle extends Cirle implements CompareObject{
    public ComparableCirle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        //方式一：
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCirle)
        {
            ComparableCirle comparableCirle = (ComparableCirle)o;
            if(this.getRadius()>comparableCirle.getRadius())
            {
                return 1;
            }
            else if(this.getRadius()<comparableCirle.getRadius())
            {
                return -1;
            }
            else
                {
                return 0;
            }
            //方式二：
           // return this.getRadius().compareTo(comparableCirle.getRadius());
        }
        else {
            return 0;
        }
    }
}
