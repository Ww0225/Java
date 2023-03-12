public class Person {
    String name;
    int sex;
    /*
    sex = 1 表示为男性
    sex = 0 表示为女性
     */
    int age;
    public void stduy()
    {
        System.out.println("studying");
    }
    public void showAge()
    {
        System.out.println("age:" + age);
    }
    public int addAge(int i)
    {
        return age += i;
    }
}
