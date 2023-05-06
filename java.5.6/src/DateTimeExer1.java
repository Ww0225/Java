import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习：三天打鱼两天晒网
 * @author 28953
 * @create 2023-05-06 11:41
 */
public class DateTimeExer1 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String date1 = "1990-01-01";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = in.nextLine();
        Date date_1 = sdf1.parse(date1);
        Date date_2 = sdf1.parse(date2);
        int totalDay = (int)(date_1.getTime()-date_2.getTime())/(1000*60*60*24);
        switch(totalDay%5){
            case 1:
            case 2:
            case 3:
                System.out.println("渔夫在打鱼");
                break;
            case 4:
            case 0:
                System.out.println("渔夫在晒网");
                break;
        }
    }
}
