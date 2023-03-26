package Test;

public class Student extends Person {
    protected String school = "pku";
    public String getinfo()
    {
        return "Name:"+name+"\nage:"+age+"\nschool:"+school;
    }

}
