import java.util.Objects;

/**
 * @author 28953
 * @create 2023-05-17 20:54
 */
public class Person implements Comparable{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person)o;
            return person.age-((Person) o).age;
        }else{
            throw new RuntimeException("传入数据类型不一致");
        }
    }
}
