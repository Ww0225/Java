public class ArrTwoFind {
    public static void main(String[] args) {
        boolean isFlag = true;
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int dest = 6;
        //初始化首索引（下标）
        int left = 0;
        //初始化尾索引
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(dest == arr[mid])
            {
                System.out.println("找到了，位置为：" + mid);
                isFlag = false;
                break;
            }
            else if(dest < arr[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        if(isFlag == true)
        {
            System.out.println("很遗憾，没找到");
        }
    }
}
