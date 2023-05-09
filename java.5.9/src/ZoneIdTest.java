import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Set;

/**
 * ZoneId:类中包含了所有的时区信息
 *
 * @author 28953
 * @create 2023-05-09 10:30
 */
public class ZoneIdTest {
    public static void main(String[] args) {
        //ZoneId的getAvailableZoneIds():获取所有的ZoneId
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        Iterator iterator = zoneIds.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //ZoneId的of():获取指定时区的时间
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);

        //ZonedDateTime:带时区的日期时间
        //ZonedDateTime的now():获取本时区的ZoneDateTime对象
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        //ZonedDateTime的now(ZoneId id):获取指定时区的ZonedDateTime对象
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime1);
    }
}
