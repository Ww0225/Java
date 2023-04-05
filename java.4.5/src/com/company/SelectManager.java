package com.company;

import java.util.Scanner;

public class SelectManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                a++;
            }
            if (ch == 'B') {
                b++;
            }
        }
        if (a > b) {
            System.out.println("A");
        } else if (a < b) {
            System.out.println("B");
        } else {
            System.out.println("E");
        }
    }
}
