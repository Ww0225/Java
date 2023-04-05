package com.company;

import java.util.Scanner;

public class isGenius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt())
        {
            int a = in.nextInt();
            if(a>=140)
            {
                System.out.println("Genius");
            }
            else{
                System.out.println("rubbish");
            }
        }
    }
}
