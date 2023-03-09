package com.company;
public class Main {
    public static void main(String[] args)
    {
        String[] names = new String[5];
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "陈六";
        names[4] = "方七";
        System.out.println(names.length);
        for(int i = 0;i < names.length ;i++)
        {
            System.out.println(names[i]);
        }
    }
}
