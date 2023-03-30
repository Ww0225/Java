package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        System.out.println("Name    Age    Gender");
        System.out.println("---------------------");
        System.out.println("Jack    18     man");

        String[] score = in.nextLine().split(" ");
        for(int i = 0;i < score.length;i++)
        {
            sum += Double.valueOf(score[i]);
        }
        System.out.println(sum/score.length);

        String a = in.next();
        String b = in.next();
        int c = Integer.parseInt(a.substring(2), 16);
        int d = Integer.parseInt(b.substring(1), 8);
        System.out.println(c+d);
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            char letter=sc.next().charAt(0);
            System.out.println(Character.isLetter(letter)?"YES":"NO");
        }

        double weight = in.nextDouble();
        double height = in.nextDouble();
        double BMI = weight/(height*height);
        if(BMI > 18.5 && BMI < 23.9)
        {
            System.out.println("Normal");
        }
        else{
            System.out.println("Abnormal");
        }
    }
}
