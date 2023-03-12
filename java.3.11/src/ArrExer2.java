import java.util.Arrays;

public class ArrExer2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};
        //判断两个数组是否相等
        boolean isEuals = Arrays.equals(arr1,arr2);
        System.out.println(isEuals);
        //输出数组信息
        System.out.println(Arrays.toString(arr1));
        //将指定值填充到数组之中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
