package Test;

public class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getinfo() {
        return "Name:"+name+"\nage:"+age+"\nschool:"+school+"\nmajor"+major;
    }
}
