package com.company;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入当月的月份:");
        int month = scanner.nextInt();
        Employee[] employees = new Employee[2];
        employees[0]=new SalariedEmployee("张三",1001,new MyDate(2003,02,25),10000);
        employees[1]=new HourlyEmployee("李四",1002,new MyDate(2002,06,20),60,240);
        for(int i = 0;i<employees.length;i++)
        {
            System.out.println(employees[i]);
            double salary = employees[i].earnings();
            System.out.println("月工资为:"+salary);
            if(month == employees[i].getBirthday().getMonth())
            {
                System.out.println("生日快乐，奖励100元");
            }
        }
    }
}
