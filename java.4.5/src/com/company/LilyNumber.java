package com.company;

public class LilyNumber {
    public static void main(String[] args) {
        for(int i = 10000;i < 99999;i++)
        {
            if(i==(i/10000)*(i%10000)+(i/1000)*(i%1000)+(i%100)*(i/100)+(i/10)*(i%10))
            {
                System.out.printf("%d ",i);
            }
        }
    }
}
