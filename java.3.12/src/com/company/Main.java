package com.company;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{34,5,22,-98,6,-76,0,30};
        //BubbleSort
        for(int i =  0;i < arr.length - 1;i++)
        {
            for(int j = 0;j < arr.length - i - 1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //反转数组
        int left = 0;
        int right = arr.length - 1;
        for(int i = 0;i < arr.length - 1;i++)
        {
            for(int j = 0;j < arr.length - i -1;j++)
            {
                if(left < right)
                {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                    right--;
                }
            }
        }
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //复制数组
        int[] arr1 = new int[arr.length];
        for(int i = 0;i < arr.length;i++)
        {
            arr1[i] = arr[i];
        }
        for(int i = 0;i < arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}
