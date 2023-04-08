package com.company;

public class MonkeyTao {
    /*问题：五只猴子分桃。半夜，第一只猴子先起来，它把桃分成了相等的五堆，多出一只。
    于是，它吃掉了一个，拿走了一堆；第二只猴子起来一看，只有四堆桃。
    于是把四堆合在一起，分成相等的五堆，又多出一个。
    于是，它也吃掉了一个，拿走了一堆；其他几只猴子也都是 这样分的。
    问：这堆桃至少有多少个？*/
    public static void main(String[] args) {
        int monkeyNumber = 5;//猴子的个数
        for(int i = 0;i < 10000;i++)
        {
            int result = fentao(monkeyNumber,i);
            if(result == 1)
            {//当返回值为1时打印
                System.out.println(i);
            }
        }
    }
    private static int fentao(int monkeyNumber, int taoNumber)
    {
        if(monkeyNumber == 0)
        {//当第0个猴子分桃时跳出
            return 1;
        }
        if((taoNumber-1)%5 != 0)
        {//当桃子不满足分5份后剩1个时跳出
            return -1;
        }
        taoNumber = (taoNumber-1)*4/5;
        return fentao(monkeyNumber-1,taoNumber);
    }
}
