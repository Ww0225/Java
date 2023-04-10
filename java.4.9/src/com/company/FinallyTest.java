package com.company;

public class FinallyTest {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b =0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("我好帅啊");
        }
    }
}
