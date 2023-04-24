import java.util.Queue;

/**
 * @author 28953
 * @create 2023-04-24 16:57
 */
public class Demo1 {
    public static void main(String[] args) {
        Usb u1 = new Phone();
        u1.Func();
        Usb u2 = new Computer();
        u2.Func();
    }
}
class Phone implements Usb{

    @Override
    public void Func() {
        System.out.println("通过usb接口，给手机充电");
    }
}
class Computer implements Usb{

    @Override
    public void Func() {
        System.out.println("通过usb接口，进行数据转移");
    }
}

