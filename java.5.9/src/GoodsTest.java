import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 28953
 * @create 2023-05-09 16:29
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("taobao",34);
        arr[1] = new Goods("douyin",43);
        arr[2] = new Goods("jingdong",12);
        arr[3] = new Goods("xianyu",21);
        //指明商品比较大小的方式:按照产品名称从低到高排序，再按照价格从高到低排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof  Goods){
                    Goods g1 = (Goods)o1;
                    Goods g2 = (Goods)o2;
                    if(g1.getName().equals(g2.getName())){
                        return -Double.compare(g1.getPrice(),g2.getPrice());
                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
