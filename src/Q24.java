public class Q24 {
    public static void main(String[] args) {

        String[] strs = new String[2];
        int idx = 0;
        for(String s : strs){
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}

/*
            What is the result?
            A.	Element 0Element 1
            B.	Null element 0Null element 1
            C.	NullNull
            D.	A NullPointerException is thrown at runtime.

 */


