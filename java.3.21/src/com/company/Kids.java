package com.company;

public class Kids extends ManKind{
    private int yearsOld;
    public Kids(){}
    public Kids(int yearsOld)
    {
        this.yearsOld = yearsOld;
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void printAge()
    {
        System.out.println("I am "+this.yearsOld);
    }
}
