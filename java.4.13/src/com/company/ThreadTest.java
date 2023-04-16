package com.company;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        t1.start();
        for(int i = 0;i<100;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i+"***main()***");
            }
        }
    }
}
