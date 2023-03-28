package com.company;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("I lost my cellphone!");
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int h = in.nextInt();
            int m = in.nextInt();
            if(m % h == 0)
            {
                System.out.println(n-m/h);
            }
            else{
                System.out.print(n-m/h-1);
            }
        }
    }
}
