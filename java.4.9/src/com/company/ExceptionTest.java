package com.company;

import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        //InputMismatchException
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);

        //NumberFormatException
        String str3 = "123";
        str3 = "abc";
        int num = Integer.parseInt(str3);

        //ClassCastException
        Object obj = new Date();
        String str2 = (String)obj;

        //StringIndexOutOfBoundsException
        String str1 = "abc";
        System.out.println(str1.charAt(3));

        //ArrayIndexOutOfBoundsException
        int[] arr1 = new int[10];
        System.out.println(arr1[10]);

        //NullPointerException
        int[] arr = null;
        System.out.println(arr[3]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }
}
