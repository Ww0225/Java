package com.company;

public class ExceptionTest1 {
    public static void main(String[] args) {
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("----1");
        }catch (NumberFormatException e){
            System.out.println("出现数值转换异常了，不要着急...");
            //String getMessage();
            System.out.println(e.getMessage());
            //printStackTrace();
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("出现空指针异常了，不要着急...");
        }
        System.out.println("----2");
    }
}
