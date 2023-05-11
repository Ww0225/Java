/**
 * @author 28953
 * @create 2023-05-11 8:40
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
    }
}
//自定义枚举类
class Season1{
    //1.声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;
    //2.私有化类的构造器,并给对象属性初始化
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.提供当前枚举类的多个对象
    public static final Season1 SPRING = new Season1("春天","春暖花开");
    public static final Season1 SUMMER = new Season1("夏天","夏日炎炎");
    public static final Season1 AUTUMN = new Season1("秋天","秋高气爽");
    public static final Season1 WINTER = new Season1("冬天","冰天雪地");
    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}