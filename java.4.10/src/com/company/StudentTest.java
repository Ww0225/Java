package com.company;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        try {
            stu.regist(-1001);
            System.out.println(stu);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
class Student{
    private int id;
    public void regist(int id){
        if(id>0){
            this.id = id;
        }else{
            //System.out.println("输入的数据非法");
            //手动抛出异常对象
            //throw new RuntimeException("输入的数据非法");
            //throw new Exception("输入的数据非法");
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}