package com.company;

import java.util.Scanner;

public class Aora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.next();
            char ch = s.charAt(0);
            if(ch>='a'&&ch<='z')
            {
                System.out.println(s.toUpperCase());
            }else if(ch>='A'&&ch<='Z')
            {
                System.out.println(s.toLowerCase());
            }
        }
    }
}
