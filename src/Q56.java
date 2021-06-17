public class Q56 {
    public static void main(String[] args) {
        String names [] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try {
            for(String n : names){
                pwd[idx] = n.substring(2,6);
                System.out.println(pwd[idx]);
                idx++;
            }
        }
        catch(Exception e){
            System.out.println("Invalid Name");
        }

    }
}

/*
        What is the result?
        A
            omas
            Invalid Name
            null
        B
            omas
            ter
            seph
        C
            Invalid Name
        D
            omas
            Invalid Name

        A.	Option A
        B.	Option B
        C.	Option C
        D.	Option D

 */