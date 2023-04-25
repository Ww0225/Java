import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author 28953
 * @create 2023-04-25 9:13
 */
public class Demo5 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Person(1,"zhangsan"));
        hashSet.add(new Person(2,"lisi"));
        hashSet.add(new Person(3,"wangwu"));
        hashSet.add(new Person(4,"zhaoliu"));
        hashSet.add(new Person(3,"wangwu"));
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Person p = (Person) iterator.next();
            System.out.println(p);
        }
    }
}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
