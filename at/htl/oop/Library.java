package at.htl.oop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    Book[] mybooks;
    int count;

    public Library() {
        this.mybooks = new Book[20];
        this.count = count;
    }

    public void addBook(Book a) {
        if (count < mybooks.length) {
            for (int i = 0; i < mybooks.length; i++) {
                if (mybooks[i] == null) {
                    mybooks[i] = a;
                    count++;
                    System.out.println("Im Bücherregal sind " + count + "Bücher.");
                    break;
                }
            }
        } else {
            System.out.println("Das Bücheregal ist leider voll");
        }
    }

    public int getNumberOfUnreadBooks() {
        int unreadBooks =0;
        for (int i = 0; i < mybooks.length; i++) {
            if ( mybooks[i] != null && !mybooks[i].isRead()){
                unreadBooks++;
            }

        }
        return unreadBooks;
    }

    public Book getBookWithMostPages(){
        Book mostPages = null;
        int max = Integer.MIN_VALUE;
        for (Book mybook : mybooks){
            if (mybook != null &&mybook.getPages()>max){
                mostPages = mybook;
                max = mybook.getPages();
            }
        }


        return mostPages;
    }

    @Override
    public String toString() {
        return "Library{" +
                "mybooks=" + Arrays.toString(mybooks) +
                ", count=" + count +
                '}';
    }
}
