public class ArrExer {
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,3,34,56,77,432};
        //法一
        for(int i = arr.length - 1;i >= 0;i--)
        {
            arr[i] = arr[i]/arr[0];
        }
        int tmp = arr[0];
        //法二
        for(int i  =0;i < arr.length;i++)
        {
            arr[i] = arr[i] / tmp;
        }
    }
}
