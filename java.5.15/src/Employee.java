/**
 * @author 28953
 * @create 2023-05-15 17:30
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {

    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee employee = (Employee)o;
            return this.name.compareTo(employee.name);
        }else{
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}
