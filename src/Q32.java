public class Q32 {

    public static void main(String[] args) {
       int aVar = 9;

       if(aVar++<10){
           System.out.println(aVar + " Hello Universe! ");
       }else {
           System.out.println(aVar + " Hello World! ");
       }
    }
}

/*
            Given the code fragment:

            if(aVar++<10){
                System.out.println(aVar + " Hello Universe! ");
            }else {
                System.out.println(aVar + " Hello World! ");
            }

            What is the result if the integer aVar is 9?

            A. Compilation fails.
            B.	10 Hello Universe!
            C.	10 Hello World!
            D.	9 Hello World!

 */