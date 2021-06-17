public class Q27 {
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.var = 300;
        System.out.println(t1);
        Test2 t2 = new Test2();
        t2.stVar = 300;
        System.out.println(t2);
    }
}
class Test2{
    public static int stVar = 100;
    public int var = 200;
    public String toString() {
        return stVar + ":" + var;
    }
}


/*
            What is the result?
            A.	300:300 200:300
            B.	300:100 200:300
            C.	300:0 0:300
            D.	100:300 300:200

 */