import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDate、LocalTime、LocalDateTime 的使用
 *
 * @author 28953
 * @create 2023-05-08 8:45
 */
public class JDK8DateTime {
    public static void main(String[] args) {
        //now():获取当前的日期，时间，日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年月日时分秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,5,8,21,12);
        System.out.println(localDateTime1);

        //getXxx():获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getDayOfYear());

        //体现不可变性
        //withXxx():设置相关的属性
        LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(18);
        System.out.println(localDate);
        System.out.println(localDateTime2);

        //plus: + 多少时间
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        //minus: - 多少时间
        LocalDateTime localDateTime4 = localDateTime.minusDays(3);
        System.out.println(localDate);
        System.out.println(localDateTime4);
    }
}
