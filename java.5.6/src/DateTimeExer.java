import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 练习：字符串"2003-02-25"转换为java.sql.Date
 * @author 28953
 * @create 2023-05-06 11:27
 */
public class DateTimeExer {
    public static void main(String[] args) throws ParseException {
        String birth = "2003-02-25";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }
}
