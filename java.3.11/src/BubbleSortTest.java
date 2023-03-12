public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,7,5,9,2,6,4,8,10,6};
        //冒泡排序
        for(int i = 0;i < arr.length - 1;i++)
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
        for(int i =0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
