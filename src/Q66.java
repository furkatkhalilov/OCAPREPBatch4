public class Q66 {
}

class Test11 {
    static int count = 0;
    int i = 0;

    public void changeCount(){
        while (i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Test11 check1 = new Test11();
        Test11 check2 = new Test11();
        check1.changeCount();
        check2.changeCount();
        System.out.print(check1.count + " : " + check2.count);

    }
}

/*
        What is the result?
        A.	5 : 5
        B.	10 : 10
        C.	5 : 10
        D.	Compilation fails.
 */