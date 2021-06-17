package Q57.p1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));
    }
}

/*


What is the result?
A
    Hello Java SE 8
    Hello Java SE 8
B
    Hello java.lang.StringBuilder@<hashcode1>>
    Hello p1.MyString@<hashcode2>
C
    Hello Java SE 8
    Hello p1.MyString@<hashcode>
D
    Compilation fails at the Test Class


A.	Option A
B.	Option B
C.	Option C
D.	Option D



 */