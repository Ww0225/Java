import java.util.*;
public class Test {
    public  static  void main(String[]  args){
        ArrayList list = new  ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}

