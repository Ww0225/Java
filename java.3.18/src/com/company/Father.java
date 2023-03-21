package com.company;

import com.company.Grandfather;

public class Father extends Grandfather{
    Father(String name,int ID,float height,int age)
    {
        super(name,ID,height,age);
    }
    public void money()
    {
        System.out.println(getName()+"正在花钱");
    }

}
