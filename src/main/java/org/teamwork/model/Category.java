package org.teamwork.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @Column(name = "category_name")
    @Size(max = 20, min = 3, message = "{category.name.invalid}")
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getReturnDate() {
        return lastUpdate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.lastUpdate = returnDate;
    }
}
