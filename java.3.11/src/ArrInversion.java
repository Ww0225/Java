public class ArrInversion {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        //方式一：
        int left = 0;
        int right = arr.length - 1;
        for(int i = 0;i < arr.length;i++)
        {
            if(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //方式二：
        for(int i =0;i < arr.length / 2;i++)
        {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = tmp;
        }
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
