package com.company;

import java.util.Scanner;

/**
 * @author 28953
 * @create 2023-04-16 18:48
 */
public class K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            for(int i = 0;i<a+1;i++)
            {
                for(int j = a+1;j>i;j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i = 0;i<a;i++)
            {
                for(int j = 0;j<=i+1;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
