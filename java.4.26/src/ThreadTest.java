/**
 * @author 28953
 * @create 2023-04-26 13:59
 */
public class ThreadTest {
    public static void main(String[] args) {
        Product p = new Product();
        Producer producer = new Producer(p);
        Customer customer = new Customer(p);
        producer.start();
        customer.start();
    }
}
class Product{
    String name;
    double price;
    boolean flag = false;
}
class Producer extends Thread{
    Product p;

    public Producer(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            synchronized (p){
                if(p.flag == false){
                    if(i%2==0){
                        p.name = "苹果";
                        p.price = 6.5;
                    }else{
                        p.name = "香蕉";
                        p.price = 2.0;
                    }
                    System.out.println("生产者生产出了："+p.name+" 价格是:"+p.price);
                    p.flag = true;
                    i++;
                    p.notify();
                }else{
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
            synchronized(p){
                if(p.flag==true){
                    System.out.println("消费者消费了"+p.name+" 价格:"+p.price);
                    p.flag = false;
                    p.notify();
                }else{
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
