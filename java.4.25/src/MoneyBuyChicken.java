/**
 * @author 28953
 * @create 2023-04-25 21:23
 */
public class MoneyBuyChicken {
    public static void main(String[] args) {
        int k = 0;
        for(int i = 1;i<=20;i++)
        {
            for(int j = 1;j<=33;j++)
            {
                k=100-i-j;
                if(k%3==0&&(i*5+j*3+k/3)==100){
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
    }
}
