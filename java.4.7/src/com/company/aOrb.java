package com.company;

import java.util.Scanner;

public class aOrb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            if(a==b)
            {
                System.out.println(a+"="+b);
            }else if(a>b)
            {
                System.out.println(a+">"+b);
            }else{
                System.out.println(a+"<"+b);
            }
        }
    }
}
