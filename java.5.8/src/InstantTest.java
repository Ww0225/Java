import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author 28953
 * @create 2023-05-08 21:37
 */
public class InstantTest {
    public static void main(String[] args) {
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);
        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //获取自1970年1月1日0时0分0秒(UTC)开始的毫秒数
        //  类似于--->Date类的getTime()
        long milli = instant.toEpochMilli();
        System.out.println(milli);
        //ofEpochMilli():通过给定的毫秒数，获取Instants实例
        //  类似于--->Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1683555204233L);
        System.out.println(instant1);
    }
}
