import java.util.ArrayList;

/**
 * @author 28953
 * @create 2023-05-30 19:33
 */
public class Include9 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        int count=0;
        for(int i = 1;i<=2019;i++){
            array.add(String.valueOf(i));
            if(array.get(i-1).contains("9")){
                count++;
            }
        }
        System.out.println(count);
    }
}
