public class RecursionExer1 {
    public static void main(String[] args) {
        RecursionExer1 exer1 = new RecursionExer1();
        int value = exer1.f(10);
        System.out.println(value);
    }
    public int f(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else if(n == 1)
        {
            return 4;
        }
        else
        {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}
