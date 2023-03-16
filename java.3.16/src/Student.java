public class Student {
    private String name;
    private int age;
    private String school;
    private String major;
    public Student(String n,int a)
    {
        name = n;
        age = a;
    }
    public Student(String n,int a,String s)
    {
        name = n;
        age = a;
        school = s;
    }
    public Student(String n,String m,int a)
    {
        name = n;
        age = a;
        major = m;
    }
}
