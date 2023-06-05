import org.junit.Test;

import java.util.Random;

/**
 * 通过反射创建对应的运行时对象
 * @author 28953
 * @create 2023-06-05 8:22
 */
public class NewInstanceTest{
    @Test
    public void test1() throws Exception{
        Class clazz = Person.class;
        //newInstance():调用此方法，创建对应的运行时是对象
        //内部调用了运行时类的空参构造器
        Object obj = clazz.newInstance();
        System.out.println(obj);
    }

    @Test
    public void test2() throws Exception {
        int num = new Random().nextInt(3);
        String classPath = "";
        switch (num){
            case 0 :
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "Person";
                break;
        }
        Object obj = getInstance(classPath);
        System.out.println(obj);
    }
    //创建一个指定类的对象
    //classPath:指定类的全名
    public Object getInstance(String classPath) throws Exception{
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }

}
