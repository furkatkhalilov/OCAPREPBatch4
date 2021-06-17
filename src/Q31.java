import java.sql.SQLOutput;

public class Q31 {

    public static void main(String[] args) {
        Vehicle1 y = new Car1();
        System.out.println(y);

    }

}
class Vehicle1 {
    int x;
    Vehicle1(){
        this(10); // line n1
    }
    Vehicle1(int x){
        this.x = x;
    }
}
class Car1 extends Vehicle1{
    int y;
    Car1(){
        super();
        //this(20); // line n2
    }
    Car1(int y){
        this.y = y;
    }
    public String toString(){
        return super.x + ":" + this.y;
    }
}

/*
            And given the code fragment:
            Vehicle1 y = new Car1();
            System.out.println(y);

            What is the result?
            A.	10:20
            B.	0:20
            C.	Compilation fails at line n1
            D.	Compilation fails at line n2

 */