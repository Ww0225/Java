package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int length = in.nextInt();
            for(int i = 0;i<length;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
