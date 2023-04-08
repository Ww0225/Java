package com.company;

public class BaiBuyBaiChicken {
    /*
    百钱买百鸡
    鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一，百钱买百鸡，问翁、母、雏各几何？
     */
    public static void main(String[] args) {
        int k = 0;//雏鸡
        for(int i = 1;i<=20;i++)
        {
            for(int j = 1;j<=33;j++)
            {
                k = 100 - i - j;
                if(k%3==0&&(i*5+j*3+k/3)==100)
                {
                    System.out.println(i+" "+" "+j +" "+k);
                }
            }
        }
    }
}
