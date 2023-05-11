/**
 * @author 28953
 * @create 2023-05-11 12:31
 */
public class EnumTest {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        //toString();
        System.out.println(summer.toString());
        System.out.println();
        //values();
        Season[] values = Season.values();
        for(int i = 0;i<values.length;i++){
            System.out.println(values[i]);
        }
        System.out.println();
        //valueof(String objName);
        Season winter = Season.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}
interface Info{
    void show();
}
enum Season implements Info{
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };
    private final String seasonName;
    private final String seasonDesc;

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
