public class WrapperTest {
    public static void main(String[] args) {
        WrapperTest wt = new WrapperTest();
        wt.test1();
    }
    public void test5()
    {
        String str1 = "123";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2);
        String str2 = "true";
        Boolean.parseBoolean(str2);
    }
    public void test4()
    {
        int num1 = 10;
        String str1 = num1 + "";
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
    }
    public void test3()
    {
        int num1 = 10;
        method(num1);
        int num2 = 10;
        Integer in1 = num2;
        boolean b1 = true;
        Boolean b2 = b1;
    }
    public void method(Object obj)
    {
        System.out.println(obj);
    }
    public void test1()
    {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2.toString());
        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");
        System.out.println(b2);
        System.out.println(b3);
        Order order = new Order();
        System.out.println(order.isMale);
        System.out.println(order.isFemale);
    }
    public void test2()
    {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1);
    }
    class Order
    {
        boolean isMale;
        Boolean isFemale;
    }
}
