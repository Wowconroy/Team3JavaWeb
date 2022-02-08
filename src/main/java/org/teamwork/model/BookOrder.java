package org.teamwork.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table
public class BookOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "return_date")
    private LocalDateTime returnDate;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookOrder bookOrder = (BookOrder) o;
        return orderId == bookOrder.orderId && Objects.equals(book, bookOrder.book) && Objects.equals(user, bookOrder.user) && Objects.equals(startDate, bookOrder.startDate) && Objects.equals(returnDate, bookOrder.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, book, user, startDate, returnDate);
    }

    @Override
    public String toString() {
        return "BookOrder{" +
                "orderId=" + orderId +
                ", book=" + book +
                ", user=" + user +
                ", startDate=" + startDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
