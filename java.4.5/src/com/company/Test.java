package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double money = in.nextDouble();
        int month = in.nextInt();
        int day = in.nextInt();
        int discount = in.nextInt();
        if(month == 11 && day == 11)
        {
            money =money*0.7-discount*50;
        } else if(month == 12 && day == 12)
        {
            money =money*0.8-discount*50;
        }
        if(money>0)
        {
            System.out.printf("%.2f",money);
        }
        else{
            System.out.printf("0.00");
        }
    }
}
