import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 28953
 * @create 2023-05-15 17:32
 */
public class TreeSetExer {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    int minusYear = b1.getYear()-b2.getYear();
                    if(minusYear != 0){
                        return minusYear;
                    }else{
                        int minusMonth = b1.getMonth() - b2.getMonth();
                        if(minusMonth!=0){
                            return minusMonth;
                        }else{
                            return b1.getDay()-b2.getDay();
                        }
                    }
                }else{
                    throw new RuntimeException("传入的数据类型不匹配");
                }
            }
        });
        Employee e1 = new Employee("liudehua",55,new MyDate(1970,5,30));
        Employee e2 = new Employee("zhourunfa",62,new MyDate(1965,5,29));
        Employee e3 = new Employee("chenyixun",41,new MyDate(1980,3,23));
        Employee e4 = new Employee("wuenwei",20,new MyDate(2003,2,25));
        Employee e5 = new Employee("mayun",50,new MyDate(1970,1,16));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
