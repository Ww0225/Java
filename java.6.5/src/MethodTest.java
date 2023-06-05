import org.junit.Test;
import sun.java2d.pipe.SpanIterator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author 28953
 * @create 2023-06-05 9:45
 */
public class MethodTest {
    @Test
    public void test1(){
        Class clazz = Person.class;
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println();

        Method[] declaredMethod = clazz.getDeclaredMethods();
        for(Method m : declaredMethod){
            System.out.println(m);
        }
    }
    //@Xxxx
    //权限修饰符  返回值类型  方法名(参数类型1 形参名1，...) throws XxxException
    //
    @Test
    public void test2(){
        Class clazz = Person.class;
        Method[] declaredMethod = clazz.getDeclaredMethods();
        for(Method m : declaredMethod){
            //1.获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for(Annotation a : annotations){
                System.out.println(a);
            }
            //2.权限修饰符
            System.out.println(Modifier.toString(m.getModifiers())+"\t");
            //3.返回值类型
            System.out.println(m.getReturnType().getName()+"\t");
            //4.方法名
            System.out.println(m.getName());
            //5.形参列表
            System.out.println(m.getReturnType());
            System.out.println();
        }
    }
}
