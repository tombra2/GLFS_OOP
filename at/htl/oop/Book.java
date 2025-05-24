package at.htl.oop;

import java.time.LocalDate;

public class Book {
private String title;
private String author;
private LocalDate publicationYear;
private int pages;
private boolean read;

    public Book(String title, String author, LocalDate publicationYear, int pages, boolean read) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.read = read;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return String.format("Titel: %s,Author: %s ,Erscheinung: %s, Seite: %s, Gelesen: %b",title,author,publicationYear,pages,read);
    }
}
