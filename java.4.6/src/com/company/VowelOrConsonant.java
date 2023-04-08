package com.company;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            char ch = in.next().charAt(0);
            ch=Character.toUpperCase(ch);
            if(ch=='A'||ch=='O'||ch=='E'||ch=='I'||ch=='U')
            {
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
    }
}
