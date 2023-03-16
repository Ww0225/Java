import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("v   v");
        System.out.println(" v v");
        System.out.println("  v");
        System.out.println("The size of short is " + Short.BYTES + " bytes.");
        System.out.println("The size of int is " + Integer.BYTES + " bytes.");
        System.out.println("The size of long is " + Long.BYTES + " bytes.");
        System.out.println("The size of long long is " + Long.BYTES + " bytes.");
        System.out.println("     **");
        System.out.println("     **");
        System.out.println("************");
        System.out.println("************");
        System.out.println("    *  *");
        System.out.println("    *  *");
        System.out.printf("%#o %#X",1234,1234);
        System.out.printf("%15d",0xABCDEF);
        System.out.println("Hello world!");
        System.out.println("Hello world!".length());
        Scanner scan = new Scanner(System.in);
        int[] score = new int[3];
        for(int i = 0;i < score.length;i++)
        {
            score[i] = scan.nextInt();
        }
        System.out.println("score1="+score[0]+",score2="+score[1]+",score3="+score[2]);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strs = s.split(";");
        String[] scores = strs[1].split(",");
        System.out.printf("The each subject score of No. %d is %.2f, %.2f, %.2f.",
                Integer.parseInt(strs[0]),Float.parseFloat(scores[0]),Float.parseFloat(scores[1]),Float.parseFloat(scores[2]));
        String n = scan.next();
        for(int i = 0;i < 5;i++)
        {
            for(int j = 0;j < 4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j <= i;j++)
            {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c",73,32,99,97,110,32,100,111,32,105,116,33);

    }
}
