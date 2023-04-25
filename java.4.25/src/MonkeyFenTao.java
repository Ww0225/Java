/**
 * @author 28953
 * @create 2023-04-25 21:27
 */
public class MonkeyFenTao {
    public static void main(String[] args) {
        int monkeyNumber = 5;
        for(int i = 0;i<10000;i++){
            int result = fentao(monkeyNumber,i);
            if(result ==1){
                System.out.println(i);
            }

        }
    }
    private static int fentao(int monkeyNumber,int taoNumber){
        if(monkeyNumber==0){
            return 1;
        }
        if((taoNumber-1)%5!=0){
            return -1;
        }
        taoNumber = (taoNumber-1)*4/5;
        return fentao(monkeyNumber-1,taoNumber);
    }
}
