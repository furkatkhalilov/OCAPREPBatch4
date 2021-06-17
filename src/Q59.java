public class Q59 {

    public static void main(String[] args) {
        int[] intArr = {8,16,32,64,128};

        for (int i = 0; i < intArr.length; i++) {
            System.out.print( intArr[i] + " ");
        }



    }
}


/*
Which two code fragments, independently, print each element in this array? (Choose two.)

 A
        for (int i : intArr){
            System.out.print( intArr[i] + " ");
        }

 B
        for (int i : intArr){
            System.out.print( i + " ");
        }

 C
        for (int i = 0 : intArr){
            System.out.print( intArr[i] + " ");
            i++;
        }
 D
        for (int i = 0; i < intArr.length; i++) {
            System.out.print( i + " ");
        }
 E
        for (int i = 0; i < intArr.length; i++) {
            System.out.print( intArr[i] + " ");
        }
 F
        for (int i; i < intArr.length; i++) {
            System.out.print( intArr[i] + " ");
        }

A. Option A
B. Option B
C. Option C
D. Option D
E. Option E
F. Option F


 */