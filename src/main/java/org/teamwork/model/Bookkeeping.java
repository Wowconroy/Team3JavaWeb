package org.teamwork.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "bookkeeping")
public class Bookkeeping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reg_id", nullable = false)
    private Long regId;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "act_id", referencedColumnName = "act_id")
    private Action action;

    @Column(name = "total_quantity")
    private long totalQuantity;

    @Column(name = "in_reading")
    private long inReading;

    @Column(name = "remain")
    private long remain;

    public Long getRegId() {
        return regId;
    }
    public void setRegId(Long regId) {
        this.regId = regId;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }

    public Long getTotalQuantity() {
        return totalQuantity;
    }
    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Long getInReading() {
        return inReading;
    }
    public void setInReading(Long inReading) {
        this.inReading = inReading;
    }

    public Long getRemain() {
        return remain;
    }
    public void setRemain(long remain) {
        this.remain = remain;
    }
}