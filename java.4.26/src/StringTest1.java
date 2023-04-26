/**
 * @author 28953
 * @create 2023-04-26 18:08
 */
public class StringTest1 {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest1 ex = new StringTest1();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.println(ex.ch);
    }
}
