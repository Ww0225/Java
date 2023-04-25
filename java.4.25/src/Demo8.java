/**
 * @author 28953
 * @create 2023-04-25 20:10
 */
public class Demo8 {
    public static void main(String[] args) {
        Product p = new Product();//产品
        //创建生产对象
        Producer producer = new Producer(p);
        //创建消费者
        Customer customer = new Customer(p);
        producer.start();
        customer.start();
    }
}
class Product{//产品类
    String name;//名字
    double price;//价格
    boolean flag = false;//产品是否生成完毕的标识，默认情况是没有生产完成
}
class Producer extends Thread{//生产者
    Product p;//产品

    public Producer(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            synchronized(p){
                if (p.flag == false) {
                    if(i%2==0){
                        p.name="苹果";
                        p.price=6.5;
                    }else{
                        p.name="香蕉";
                        p.price=2.0;
                    }
                    System.out.println("生产者生产出了:"+p.name+"价格是:"+p.price);
                    p.flag = true;
                    i++;
                    p.notify();//唤醒消费者去消费
                }else{
                    //已经生产完毕，等待消费者先去消费
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
class Customer extends Thread{
    Product p;

    public Customer(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            synchronized (p){
                if(p.flag == true){//产品已经生产完毕
                    System.out.println("消费者消费了"+p.name+" 价格:"+p.price);
                    p.flag = false;
                    p.notify();//唤醒生产者去生产
                }else{
                    //产品还没有生产，应该等待生产者先生产
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
