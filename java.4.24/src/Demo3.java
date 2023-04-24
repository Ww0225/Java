/**
 * @author 28953
 * @create 2023-04-24 17:06
 */
public class Demo3 {
    public static void main(String[] args) {
        Worker[] workers = {new Manager("经理1",20),new Boss("老板1",40),
                            new Manager("经理2",25),new Boss("老板2",45),
                            new Manager("经理3",27),new Boss("老板3",50)};
        for(int i = 0;i<workers.length;i++)
        {
            if(workers[i] instanceof Manager){
                Manager manager = (Manager) workers[i];
                System.out.println(manager.name+","+manager.age);
            }else if(workers[i] instanceof Boss){
                Boss boss = (Boss) workers[i];
                System.out.println(boss.name+","+boss.age);
            }else{
                System.out.println("程序错误");
            }
        }
    }
}
class Worker{
    String name;
    int age;
    public Worker(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Manager extends Worker{
    public Manager(String name,int age){
        super(name,age);
    }
}
class Boss extends Worker{
    public Boss(String name,int age){
        super(name,age);
    }
}
