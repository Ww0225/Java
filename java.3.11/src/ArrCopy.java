public class ArrCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,5,7,11,13,17,19};
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i < arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i = 0;i < arr1.length;i++)
        {
            arr2[i] = arr1[i];
            if(i % 2 ==0)
            {
                arr2[i] = i;
            }
            System.out.print(arr1[i] + " ");
        }
    }
}
