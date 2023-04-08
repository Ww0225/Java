package com.company;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCirle c1 = new ComparableCirle(3.4);
        ComparableCirle c2 = new ComparableCirle(3.6);
        int compareValue = c1.compareTo(c2);
        if(compareValue>0){
            System.out.println("c1大");
        }else if(compareValue<0)
        {
            System.out.println("c2大");
        }
        else{
            System.out.println("一样大");
        }
    }
}
