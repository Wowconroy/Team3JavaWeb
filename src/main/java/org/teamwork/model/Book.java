package org.teamwork.model;

import java.util.Objects;

public class Book {
    private int bookId;
    private String title;
    private String description;
    private int releaseYear;
    private double rate;

    public Book() {
    }

    public Book(int bookId, String title, String description, int releaseYear, double rate) {
        this.bookId = bookId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rate = rate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && releaseYear == book.releaseYear && Double.compare(book.rate, rate) == 0 && Objects.equals(title, book.title) && Objects.equals(description, book.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, description, releaseYear, rate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", rate=" + rate +
                '}';
    }
}
