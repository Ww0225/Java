
/**
 * @author 28953
 * @create 2023-05-01 17:33
 */
public class Test3 {
    public static void main(String[] args) {
        Enroll enroll = new Enroll();
        School school1 = new School(525);
        Student1 s1 = new Student1("Tom",1001,555);
        Student1 s2 = new Student1("Jerry",1002,425);
        enroll.isEnroll(s1,school1.getLine(),s1.getTotal());
        enroll.isEnroll(s2,school1.getLine(),s2.getTotal());

    }
}
class School{
    private double line;

    public School(double line) {
        this.line = line;
    }

    public double getLine() {
        return line;
    }

    public void setLine(double line) {
        this.line = line;
    }
}
class Student1{
    private String name;
    private int id;
    private double total;
    public Student1(String name, int id, double total) {
        this.name = name;
        this.id = id;
        this.total = total;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
class Enroll{
    public void isEnroll(Student1 student,double line,double total){
        if(total>=line){
            System.out.println(student.getName()+"考了"+total+",被录取");
        }else{
            System.out.println(student.getName()+"考了"+total+",没有被录取");
        }
    }
}