package com.company;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;
        float average = 0.0f;
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = (int)(Math.random() * 90)+10;
        }
        int maxNumber = arr[0];
        int minNumber = arr[0];
        for(int i = 1;i < arr.length;i++)
        {
            if(maxNumber < arr[i])
            {
                maxNumber = arr[i];
            }
        }
        for(int i = 0;i < arr.length;i++)
        {
            if(minNumber > arr[i])
            {
                minNumber = arr[i];
            }
            total += arr[i];
            average = total / arr.length;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("最大值为："+ maxNumber);
        System.out.println("最小值为："+ minNumber);
        System.out.println("和值为："+ total);
        System.out.println("平均值为："+ average);
    }
}
