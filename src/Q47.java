public class Q47 {
    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String s : strs){
            strs[idx].concat(" element " + idx);
            idx ++;
        }
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }


    }
}

/*
        What is the result?
        A.	AB
        B.	A element 0B element 1
        C.	A NullPointerException is thrown at runtime.
        D.	A 0B 1

 */