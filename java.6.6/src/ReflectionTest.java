import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 调用运行时类中指定的结构：属性，方法，构造器
 * @author 28953
 * @create 2023-06-06 22:27
 */
public class ReflectionTest {
    @Test
    public void testField()throws Exception{
        Class clazz = Person.class;
        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();
        //获取指定的属性
        Field id = clazz.getField("id");
        id.set(p,18);
        int pId = (int)id.get(p);
        System.out.println(pId);
    }
    @Test
    public void testField1() throws Exception{
        Class clazz = Person.class;
        Person p = (Person) clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"Tom");
        System.out.println(name.get(p));
    }
    @Test
    public void testMethod()throws Exception{
        Class clazz = Person.class;
        Person p = (Person) clazz.newInstance();
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        show.invoke(p,"CHN");

    }

}
