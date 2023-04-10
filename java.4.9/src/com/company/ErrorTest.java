package com.company;

public class ErrorTest {

    public static void main(String[] args) {
        //栈溢出 java.lang.StackOverflowError
        //main(args);
        //堆溢出 java.lang.OutOfMemoryError
        Integer[] arr = new Integer[1024*1024*1024];
    }
}
