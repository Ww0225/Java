public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        int sum = test.getSum(100);
        System.out.println(sum);
    }
    public int getSum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n + getSum(n - 1);
        }
    }
}
