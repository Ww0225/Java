public class InterviewTest {
    public static void main(String[] args) {
        InterviewTest in1 = new InterviewTest();
        in1.test1();
        in1.test2();
        in1.method1();
    }
    public void method1()
    {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

    }
    public void test1()
    {
        Object o1 = true ? new Integer(1):new Double(2.0);
        System.out.println(o1);//1.0
    }
    public void test2()
    {
        Object o2;
        if(true)
        {
            o2 = new Integer(1);
        }
        else
        {
            o2 = new Double(2.0);
        }
        System.out.println(o2);//1
    }
}
