public class Q11 {
}

// int - long - float - double - OBJECTS (Integer)
class SumTest {
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum is " + (x + y));
    }
    public static void doSum(int x, int y){
        System.out.println("int sum is " + (x + y));
    }
    public static void doSum(long x, long y){
        System.out.println("long sum is " + (x + y));
    }
    public static void doSum(double x, double y){
        System.out.println("double sum is " + (x + y));
    }
    public static void doSum(float x, float y){
        System.out.println("float sum is " + (x + y));
    }

    public static void main(String[] args) {

        doSum(10,20);
        doSum(10.0,20.0);
    }

}

/*
A
    float sum is 30.0
    double sum is 30.0
B
    double sum is 30.0
    float sum is 30.0
C
    Integer sum is 30.0
    double sum is 30.0
D
    Integer sum is 30.0
    float sum is 30.0

        A.	Option A
        B.	Option B
        C.	Option C
        D.	Option D


 */