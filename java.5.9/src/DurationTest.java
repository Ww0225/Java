import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Duration:用于计算两个"时间"间隔，以秒和纳秒为基准
 *
 * @author 28953
 * @create 2023-05-09 10:38
 */
public class DurationTest {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(10,40,32);
        //between():静态方法，返回Duration对象，表示两个时间的间隔
        Duration duration = Duration.between(localTime1,localTime);
        System.out.println(duration);
        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());

        LocalDateTime localDateTime = LocalDateTime.of(2022,5,9,10,44);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,5,9,10,44);
        Duration duration1 = Duration.between(localDateTime,localDateTime1);
        System.out.println(duration1.toDays());
    }
}
