public class Fibonacci {
    public static void main(String[] args) {

    }
    public int fibonacci(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        else if(n > 2)
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return -1;
    }
}
