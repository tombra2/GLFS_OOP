package at.htl.libary;

import java.time.LocalDate;

public class Library {
    Book[] myBook;


    public Library(int size) {
       myBook = new Book[size];
    }

    public void addBook(Book book) {
        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i] == null) {
                myBook[i] = book;
                break;
            }
        }
    }

    public int getNumberOfUndreadedBooks() {
        int count = 0;
        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i].isRead()) {
                count++;
            }
        }
        return count;
    }

    public Book getBookWithMostPages() {
        int maxPages = 0;
        Book maxBook = null;
        for (Book book : myBook) {
            if (book.getPageCount() > maxPages) {
                maxPages = book.getPageCount();
                maxBook = book;
            }
        }
        return maxBook;
    }

    public Book getOldestBook() {
        Book oldestBook = null;
        LocalDate oldestDate = LocalDate.now();

        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i].getPublishDate().isBefore(oldestDate)) {
                oldestBook = myBook[i];
                oldestDate = myBook[i].getPublishDate();

            }
        }

        return oldestBook;
    }
    public Book getLatestBook() {
        Book latestBook = null;
        LocalDate latestDate = LocalDate.now();
        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i].getPublishDate().isAfter(latestDate)) {
                latestBook = myBook[i];
                latestDate = myBook[i].getPublishDate();

            }
        }
    return latestBook;
    }

    public void setAlreadyRead() {
        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i] != null) {
                myBook[i].setRead(true);
            }
        }
    }
    public void setAlreadyRead(Book [ ] myBook ) {
        for (int i = 0; i < myBook.length; i++) {
            if (myBook[i] != null) {
                myBook[i].setRead(true);
            }
        }
    }
}
