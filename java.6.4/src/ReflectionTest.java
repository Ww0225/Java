import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 关于java.lang.Class的理解
 * 1.类的加载过程：
 * 程序经过javac.exe命令以后，会生成一个或多个字节码文件(.class结尾)
 * 接着我们使用java.exe命令对某个字节码文件进行解释运行
 * 相当于将某个字节码文件加载到内存中，此过程称为类的加载
 * 加载到内存中的类，就称为运行时类，作为Class的一个实例
 *
 *
 *
 * @author 28953
 * @create 2023-06-04 19:35
 */
public class ReflectionTest {
    //反射之前，对于Person的操作
    @Test
    public void test1(){
        //1.创建Person的对象
        Person p1 = new Person("Tom",12);
        //2.通过对象调用其内部的方法，属性
        p1.age=20;
        System.out.println(p1.toString());
        p1.show();

        //在Person外部，不可以通过对象调用其内部私有结构
        //比如：name，showNation(),私有构造器
    }
    @Test
    public void test2() throws Exception {
        //1.通过反射，创建Person类的对象
        Class clazz = Person.class;
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("Tom", 12);
        Person p = (Person)obj;
        System.out.println(p.toString());
        //2.通过反射，调用对象指定的属性，方法
        //调属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p);

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        //通过反射，可以调用Person类的私有结构
        Constructor constructor1 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person p1 = (Person)constructor1.newInstance("Jerry");
        System.out.println(p1);

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"ww");
        System.out.println(p1);

        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        showNation.invoke(p1,"中国");
    }

    //获取Class的实例的方式
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一：调用运行时类的属性：.class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二：通过运行时类的对象,调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        //方式三：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("Person");
        System.out.println(clazz3);

        System.out.println(clazz1==clazz2);
        System.out.println(clazz1==clazz3);

        //方式四：使用类的加载器：ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("Person");
        System.out.println(clazz4);
    }

    @Test
    public void test4(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        //只要元素类型与维度一样，就是同一个Class
        System.out.println(c10==c11);
    }
}
