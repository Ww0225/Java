package com.company;

public class HourlyEmployee extends Employee{
    private int hour;
    private int wage;

    public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public int earnings() {
        return wage*hour;
    }
    public String toString()
    {
        return "HourlyEmployee{"+super.toString();
    }
}
