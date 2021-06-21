public class Q25 {
    public static void main(String[] args) {
        Book book2 = new EBook();
        book2.readBook();
    }

}

interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {
    public void readBook();
}

abstract class Book implements Readable {
    public void readBook() {
        System.out.println("Read Book");
    }

    }

class EBook extends Book {
    @Override
    public void download() {

    }

    public void readBook(){
        System.out.println("Read E-Book");
    }
}

/*
            What is the result?
        A.	Compilation fails at line n2.
        B.	Read Book
        C.	Read E-Book
        D. Compilation fails at line n1.
        E. Compilation fails at line n3.
*/