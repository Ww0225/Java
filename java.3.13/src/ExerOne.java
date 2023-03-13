public class ExerOne {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student[] stus = new Student[20];
        for(int i = 0;i < stus.length;i++)
        {
            //给数组元素赋值
            stus[i] = new Student();
            stus[i].number = i + 1;
            //年级：[1,6]
            stus[i].state = (int)(Math.random() * 6 + 1);
            //成绩：[0,100]
            stus[i].score = (int)(Math.random() * 101);
        }
        for(int i = 0;i < stus.length;i++)
        {
            if(stus[i].state == 3)
            {
                System.out.println(stus[i].showInfo());
            }
        }
        System.out.println();
        //使用冒泡排序对学生成绩进行排序
        for(int i = 0;i < stus.length - 1;i++)
        {
            for(int j = 0;j < stus.length - i - 1;j++)
            {
                if(stus[j].score > stus[j+1].score)
                {
                    Student tmp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = tmp;
                }
            }
        }
        for(int i = 0;i < stus.length;i++)
        {
                System.out.println(stus[i].showInfo());
        }
    }
}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩
    public String showInfo()
    {
        return "学号为：" + number + " 年级为：" + state + " 成绩为: " + score;
    }
}
