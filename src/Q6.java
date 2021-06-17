import java.io.IOException;
public class Q6 { }

class X {
    public void printFileContent() {
        /* Code goes here */

//        throw new IOException();


    }
}
class Test {
    public static void main(String[] args) {
        X xobj = new X();
        xobj.printFileContent();
    }
}

/*
Which two modifications should you make so that the code compiles successfully? (Choose two.)
A.  Replace line 13 with:
        try {
            xobj.printFileContent();
        }
        catch (Exception e) { }
        catch (IOException e) { }

B. Replace line 7 with throw IOException("Exception raised");

C. Replace line 11 with public static void main (String[] args) throws Exception{

D. At line 14, insert throw new IOException();

E. Replace line 5 with public void printFileContent() throws IOException{

    A.	Option A
    B.	Option B
    C.	Option C
    D.	Option D
    E.  Option E


 */