package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String a = in.nextLine();
            a = a.toLowerCase();
            System.out.println(a);
        }
    }
}
