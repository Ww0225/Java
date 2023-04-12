package com.company;

import java.util.Scanner;

public class DaoZhiJiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int high = in.nextInt();
            for(int i =1 ;i<=high;i++)
            {
                for(int j = high;j>=i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("**********************");
            for(int i = 1; i<=high;i++)
            {
                for(int j=1;j<=high-i;j++)
                {
                    System.out.print("  ");
                }
                for(int j = 0 ;j<i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

