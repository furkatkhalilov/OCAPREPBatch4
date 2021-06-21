package Q83.p3;

import Q83.p1.A;
import Q83.p1.p2.B;  // line n2

public class C {
    public static void main(String[] args) {
        A o1 = new A();
        B o2 = new B();
    }
}

/*
Which modification enables the code to compile?

A.          Replace line n1 with:
            import p1.*;
            Replace line n2 with:
            import p1.p2.*;

A.          Replace line n1 with:
            import p1.A;
            Replace line n2 with:
            import p1.*;

A.          Replace line n1 with:
            import p1.A;
            Replace line n2 with:
            import p1.A;
            import p1.p2.B

A.          Replace line n1 with:
            import p1;
            Replace line n2 with:
            import p1;
            import p1.p2;


A.	Option A
B.	Option B
C.	Option C
D.	Option D

 */
