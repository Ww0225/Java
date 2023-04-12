package com.company;

import java.util.Scanner;

public class ZhengFangXing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int length = in.nextInt();
            for(int i = 0;i<length;i++)
            {
                for(int j = 0;j<length;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
