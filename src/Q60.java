public class Q60 {
}

class A1 {
    public A1 () {
        System.out.println("A ");
    }
}
class B1 extends A1 {               // line n1
    public B1 () {
        System.out.println("B ");
    }
}
class C1 extends B1 {               // line n2
    public C1(){
        System.out.println("C ");
    }

    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}
/*
            What is the result?
            A.	C B A
            B.	C
            C.	A B C
            D.	Compilation fails at line n1 and line n2

 */

