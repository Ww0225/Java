package com.company;
public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        int area = test.method();
        System.out.println("面积为:" + area);
        System.out.println("面积为:" + test.methodPlus(12,10));
    }
    public int method()
    {
        for(int i = 0;i < 10;i++)
        {
            for(int j = 0;j < 8;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }
    public int methodPlus(int m,int n)
    {
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
