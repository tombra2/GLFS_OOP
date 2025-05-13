package at.htl.libary;

import java.time.LocalDate;

public class Book {
private String title;
private String lastNameAutor;
private LocalDate publishDate;
private int pageCount;
private boolean read;

    public Book(String title, String lastNameAuthor, LocalDate publishDate, int pageCount, boolean isRead) {
        this.title = title;
        this.lastNameAutor = lastNameAuthor;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
        this.read = isRead;
    }

    public Book() {

    }

    public static Book of(String str) {
        String[] tokens = str.split(";");
        for (String token : tokens) {


        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastNameAutor() {
        return lastNameAutor;
    }

    public void setLastNameAutor(String lastNameAutor) {
        this.lastNameAutor = lastNameAutor;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }


    @Override
    public String toString() {
        return String.format("%s ,%s, %s, %s, %b", title, lastNameAutor, publishDate, pageCount, read);
    }
}
