package com.company;

import java.util.Scanner;

public class isPerfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int score = in.nextInt();
            if(score>=90 && score <=100)
            {
                System.out.println("Perfect");
            }else{
                System.out.println("No Perfect");
            }
        }
    }
}
