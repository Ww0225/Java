package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.println(1<<a);
            //System.out.println((int)Math.pow(2,a));
        }
    }
}
