package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int t = in.nextInt();
            if(t>0){
                System.out.println(1);
            }else if(t==0){
                System.out.println(0.5);
            }else{
                System.out.println(0);
            }
        }
    }
}
