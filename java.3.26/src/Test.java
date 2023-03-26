import java.util.Objects;
import java.util.Scanner;
public class Test {
    int age;
    String name;
    public static void main(String[] args) {
        Test test = new Test();
        Scanner in = new Scanner(System.in);
        double score1 = in.nextDouble();
        double score2 = in.nextDouble();
        double score3 = in.nextDouble();
        double total = score1 + score2 + score3;
        System.out.printf("%.2f %.2f",total,total/3);
        double weight = in.nextDouble();
        double height = in.nextDouble();
        double BMI = weight/(height/100*height/100);
        System.out.printf("%.2f",BMI);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double circumference = a+b+c;
        double p = circumference/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("circumference=%.2f area=%.2f",circumference,area);
        double radius = in.nextDouble();
        double V = 4/3.0*Math.PI *radius*radius*radius;
        //double V = 4/3.0*Math.PI*Math.pow(radius,3);
        System.out.printf("%.3f",V);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return age == test.age &&
                Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }
    /* @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Test) {
            Test test = (Test)obj;
            *//*if(this.age == test.age && this.name.equals(test.name))
            {
                return true;
            }
            else
            {
                return false;
            }*//*
            return this.age == test.age && this.name.equals(test.name);
        }
        return false;
    }*/
}
