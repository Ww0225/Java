import java.util.Objects;

/**
 * @author 28953
 * @create 2023-05-21 15:12
 */
public class Student extends Person {
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id);
    }

    public Student() {

    }

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
