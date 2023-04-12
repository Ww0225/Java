package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int year = in.nextInt();
            int month = in.nextInt();
            if(month == 4||month == 6||month == 9||month == 11){
                System.out.println(30);
            }else if(month ==2){
                if((year%4==0&&year%100!=0)||(year%400==0)){
                    System.out.println(29);
                }else{
                    System.out.println(28);
                }
            }else{
                System.out.println(31);
            }

        }
    }
}
