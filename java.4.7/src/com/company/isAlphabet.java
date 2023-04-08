package com.company;

import java.util.Scanner;

public class isAlphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            char ch = in.next().charAt(0);
            boolean isFlag = Character.isLetter(ch);
            System.out.print(ch);
            String m = isFlag ? " is an alphabet.":" is not an alphabet.";
            System.out.println(m);
        }
    }
}
