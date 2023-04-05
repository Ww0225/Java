package com.company;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int score = in.nextInt();
            if(score>=60)
            {
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
        }
    }
}
