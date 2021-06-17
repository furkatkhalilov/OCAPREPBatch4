import java.sql.SQLOutput;

public class Q23 {
    public static void main(String[] args) {

        int[] stack = {10,20,30};
        int size = 3;
        int idx = 0;

        /* line n1 */

        System.out.println("The Top element: " + stack[idx]);
    }
}

/*
            Which code fragment, inserted at line n1, prints The Top element: 30?
            A.
                do  {
                    idx ++;
                } while (idx >=  size);

            B. while (idx < size) {
                idx++;
                }

            C. do {
                    idx++;
              } while (idx < size -1);

            D. do {
                    idx++;
             } while (idx <= size);

             E. while (idx <= size -1){
                    idx++;
             }
            A.	Option A
            B.	Option B
            C.	Option C
            D.	Option D E.
            E.	Option E

 */
