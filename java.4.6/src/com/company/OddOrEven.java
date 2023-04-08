package com.company;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int number = in.nextInt();
            if(number % 2 ==0)
            {
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
