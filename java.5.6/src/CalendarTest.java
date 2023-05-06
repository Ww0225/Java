import java.util.Calendar;
import java.util.Date;

/**
 * @author 28953
 * @create 2023-05-06 13:55
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        //getTime():日历类---> Date
        Date date = calendar.getTime();
        System.out.println(date);
        //setTime(): Date--> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
