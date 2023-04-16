package com.company;

/**
 * @author 28953
 * @create 2023-04-14 9:13
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:1");
        h1.setName("线程一");
        h1.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        for(int i =0;i<100;i++)
        {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            if(i==20){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(h1.isAlive());
    }
}
class HelloThread extends Thread{
    @Override
    public void run() {
        for(int i =0;i<100;i++)
        {
            if(i%2==0){
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            /*if(i%20==0){
                yield();
            }*/
        }
    }
    public HelloThread(String name){
        super(name);
    }
}
