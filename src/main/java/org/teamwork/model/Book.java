package org.teamwork.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "title")
    @Size(max = 20, min = 3, message = "{book.title.invalid}")
    @NotEmpty(message="Please Enter book title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    @Size(min = 4, max = 4)
    private int releaseYear;

    @Column(name = "rate")
    private double rate;

    public Book() {
    }

    public Book(Long bookId, String title, String description, int releaseYear, double rate) {
        this.bookId = bookId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rate = rate;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
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
