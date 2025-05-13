package at.htl.libary;

import java.time.LocalDate;

public class TestLibrary {
    public static void main(String[] args) {

        Book dumpo = new Book("abc","abc", LocalDate.of(1990,1,1),222,false);
        System.out.println(dumpo.toString());
        Library library = new Library(2);
        library.addBook(dumpo);

    }
}
