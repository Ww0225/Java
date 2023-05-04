import java.util.Date;

/**
 * @author 28953
 * @create 2023-05-04 13:16
 */
public class DateTimeTest {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        Date date2 = new Date(1683177641536L);
        System.out.println(date2.toString());
    }
}
