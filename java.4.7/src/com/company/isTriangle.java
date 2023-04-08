package com.company;

import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a+b>c&&a+c>b&&b+c>a){
                if(a==b&&b==c){
                    System.out.println("Equilateral triangle!");
                }else if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&b!=a)){
                    System.out.println("Isosceles triangle!");
                }else{
                    System.out.println("Ordinary triangle!");
                }
            }else{
                System.out.println("Not a triangle!");
            }
        }
    }
}
