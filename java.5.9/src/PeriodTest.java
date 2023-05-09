import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * Period:用于计算两个"日期"间隔，以年月日衡量
 *
 * @author 28953
 * @create 2023-05-09 10:46
 */
public class PeriodTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2028,5,9);

        Period period = Period.between(localDate,localDate1);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        Period period1 = period.withYears(2);
        System.out.println(period1);
    }
}
