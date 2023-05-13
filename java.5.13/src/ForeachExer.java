/**
 * @author 28953
 * @create 2023-05-13 21:42
 */
public class ForeachExer {
    public static void main(String[] args) {
        String[] arr = new String[]{"MM","MM","MM"};
        for(String str : arr){
            str = "GG";
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
