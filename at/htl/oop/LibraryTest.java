package at.htl.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean close = false;
        Library alex = new Library();


        do {
            System.out.println("Gibt deine Befehl ein: add /quit ");
            String command = sc.next();

            switch (command) {
                case "add":
                    System.out.println("Gib den Buchtitel ein: ");
                    String name = sc.next();
                    System.out.println("Gib den Author ein: ");
                    String author = sc.next();
                    System.out.println("Gib das Erscheinungsjahr ein: (dd.MM.yyyy) ");
                    String release = sc.next();
                    LocalDate date = StringToDate(release);
                    System.out.println("Gib die Anzahl der Seite ein: ");
                    int pages = sc.nextInt();
                    System.out.println("Wurde das Buch bereits gelsen: ");
                    boolean read = Boolean.parseBoolean(sc.next());
                    Book addBook = new Book(name, author, date, pages, read);
                    alex.addBook(addBook);
                    System.out.println("Daten wurd erfasst und geparst");
                    break;
                case "quit":
                    close = true;
                    System.out.println("Programm wird beendet");
            }
        } while (!close);
        System.out.println(alex.toString());

    }

    public static LocalDate StringToDate(String date) {
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(date, fm);
    }
}
