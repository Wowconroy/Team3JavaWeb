package ua.lviv.soft.domain;

import java.util.Objects;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private String coAuthor;
    private String description;
    private String category;

    private int rate;
    private int year;
    private String remaining;
    private int averageTime;
    private int views;


    public Book() {
    }
    public Book(String title, String author, String coAuthor, String description, String category, int rate, int year, String remaining, int averageTime, int views) {
        this.title = title;
        this.author = author;
        this.coAuthor = coAuthor;
        this.description = description;
        this.category = category;
        this.rate = rate;
        this.year = year;
        this.remaining = remaining;
        this.averageTime = averageTime;
        this.views = views;
    }
    public Book(Integer id, String title, String author, String coAuthor, String description, String category, int rate, int year, String remaining, int averageTime, int views) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.coAuthor = coAuthor;
        this.description = description;
        this.category = category;
        this.rate = rate;
        this.year = year;
        this.remaining = remaining;
        this.averageTime = averageTime;
        this.views = views;
    }

    public Book(Integer id, String title, String author, String description, String category, int year, int views) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.year = year;
        this.views = views;
    }

    public Book(Integer id, String title, String description, String category, int year, int views) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.year = year;
        this.views = views;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCoAuthor() {
        return coAuthor;
    }

    public void setCoAuthor(String coAuthor) {
        this.coAuthor = coAuthor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRemaining() {
        return remaining;
    }

    public void setRemaining(String remaining) {
        this.remaining = remaining;
    }

    public int getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(int averageTime) {
        this.averageTime = averageTime;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return rate == book.rate &&
                year == book.year &&
                averageTime == book.averageTime &&
                views == book.views &&
                Objects.equals(id, book.id) &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(coAuthor, book.coAuthor) &&
                Objects.equals(description, book.description) &&
                Objects.equals(category, book.category) &&
                Objects.equals(remaining, book.remaining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, coAuthor, description, category, rate, year, remaining, averageTime, views);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", coAuthor='" + coAuthor + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", rate=" + rate +
                ", year=" + year +
                ", remaining='" + remaining + '\'' +
                ", averageTime=" + averageTime +
                ", views=" + views +
                '}';
    }
}
