package com.company;

public class Manager extends Employee{
    private double bonus;//奖金
    public void work()
    {
        System.out.println("Manager 工作");
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
