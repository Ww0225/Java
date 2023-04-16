package com.company;

/**
 * @author 28953
 * @create 2023-04-14 9:01
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
