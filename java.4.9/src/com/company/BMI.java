package com.company;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextDouble()) { // 注意 while 处理多个 case
            double weight = in.nextDouble();
            double height = in.nextDouble();
            double BMI = weight/(height/100.0*height/100.0);
            if(BMI<18.5){
                System.out.println("Underweight");
            }else if(BMI>27.9){
                System.out.println("Obese");
            }else if(BMI>=18.5 && BMI<=23.9){
                System.out.println("Normal");
            }else{
                System.out.println("Overweight");
            }
        }
    }
}
