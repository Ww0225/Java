package com.company;

public class MyException extends RuntimeException{
    static final long serialVersionUID = - 7034897190745766939L;
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }

}
