package com.company;
public class Main {
    public static void main(String[] args) {
        label:for(int i = 2;i <= 100; i++)
        {
            boolean isFlag = true;
            for(int j = 2;j <= Math.sqrt(i);j++)
            {
                if(i % j == 0)
                {
                    continue label;
                }
            }
                System.out.print(i+ " ");
        }
    }
}
