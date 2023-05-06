import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author 28953
 * @create 2023-05-06 14:34
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person("Tom",18);
        Person p2 = new Person("Jerry",20);
        Person p3 = new Person("Mike",23);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
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
}
