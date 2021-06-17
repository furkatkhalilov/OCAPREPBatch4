public class Q63 {
    C2 obj1 = new C11();
    I obj2 = new C11();

//     C2 s = obj2;
//     I t = obj1;
//
//    t.displayI();
//    s.displayC2();
}

class C2 {
    public void displayC2 () {
        System.out.println("C2");
    }
}
interface I {
    public void displayI();
}

class C11 extends C2 implements I {
    public void displayI() {
        System.out.print("C1");
    }
}

    /*
            What is the result?
        A.	C2C2
        B.	C1C2
        C.	C1C1
        D.	Compilation fails

     */