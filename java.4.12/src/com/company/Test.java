package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            if (str.contains("+")) {
                String[] strs = str.split("\\+");
                double a = Double.parseDouble(strs[0]);
                double b = Double.parseDouble(strs[1]);
                System.out.printf("%.4f+%.4f=%.4f", a, b, a + b);
            } else if (str.contains("-")) {
                String[] strs = str.split("-");
                double a = Double.parseDouble(strs[0]);
                double b = Double.parseDouble(strs[1]);
                System.out.printf("%.4f-%.4f=%.4f", a, b, a - b);
            } else if (str.contains("*")) {
                String[] strs = str.split("\\*");
                double a = Double.parseDouble(strs[0]);
                double b = Double.parseDouble(strs[1]);
                System.out.printf("%.4f*%.4f=%.4f", a, b, a * b);
            } else if (str.contains("/")) {
                String[] strs = str.split("/");
                double a = Double.parseDouble(strs[0]);
                double b = Double.parseDouble(strs[1]);
                if(b==0){
                    System.out.println("Wrong!Division by zero!");
                }else{
                    System.out.printf("%.4f/%.4f=%.4f", a, b, a / b);
                }
            }else{
                System.out.println("Invalid operation!");
            }
        }
    }
}
