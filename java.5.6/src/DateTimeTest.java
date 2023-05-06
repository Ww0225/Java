import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 28953
 * @create 2023-05-06 10:54
 */
public class DateTimeTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        String str = "23-5-6 上午11:15";
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        System.out.println();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-d hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
        Date date2 = sdf1.parse("2023-05-6 11:21:21");
        System.out.println(date2);
    }
}
