import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * DateTimeFormatter:格式化或解析日期、时间
 * 类似于SimpleDateFormat
 * @author 28953
 * @create 2023-05-08 22:31
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //方式一:
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化:日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);
        //解析:字符串-->日期
        TemporalAccessor parse = formatter.parse("2023-05-08T22:40:58.122");
        System.out.println(parse);
        //方式二:
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);
        //重点:  方式三：自定义的格式，如ofPattern("yyyy-MM-dd hh:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str3 = formatter2.format(LocalDateTime.now());
        System.out.println(str3);
    }
}
