package com.company;

import java.util.Scanner;

public class Max_Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max_score = 0;
        int chinese_score = in.nextInt();
        int math_score = in.nextInt();
        int english_socre = in.nextInt();
        max_score = chinese_score>math_score?chinese_score:math_score;
        max_score = max_score>english_socre?max_score:english_socre;
        System.out.println(max_score);
    }
}
