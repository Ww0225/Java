public class PrimeNumber {
    public static void main(String[] args)
    {
        int i = 0;
        int j = 0;
        for(i = 2; i <= 100;i++)
        {
            boolean isFlag = true;
            for(j = 2;j <= Math.sqrt(i) ;j++)
            {
                if(i % j == 0)
                {
                    isFlag = false;
                    break;
                }
            }
            if(isFlag == true)
            {
                System.out.println(i+" ");
            }
        }
    }
}
