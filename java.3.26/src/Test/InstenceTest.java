package Test;

public class InstenceTest {
    public static void main(String[] args) {
        InstenceTest test = new InstenceTest();
        test.method(new Student());
    }
    public void method(Person e)
    {
        String info = e.getinfo();
        System.out.println(info);
        if(e instanceof Graduate)
        {
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }
        else if(e instanceof Student)
        {
            System.out.println("a student");
            System.out.println("a person");
        }
        else if(e instanceof Person)
        {
            System.out.println("a person");
        }
    }
}
