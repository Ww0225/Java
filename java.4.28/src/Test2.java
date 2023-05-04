/**
 * @author 28953
 * @create 2023-05-01 17:23
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Tom");
        s1.setScore(88);
        Student s2 = new Student("Jerry",98);
        System.out.println(s1.getName()+" "+s1.getScore());
        System.out.println(s2.getName()+" "+s2.getScore());
    }
}
class Student{
    private String name;
    private int score;
    public Student() {
    }
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
