package org.teamwork.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    private int userId;
    private String firstName;
    private String lastName;
    private int roleId;
    private String email;
    private String password;
    private LocalDateTime dateOfBirth;
    private final LocalDateTime regDate = LocalDateTime.now();

    public User() {}
    
    public User(int userId, String firstName, String lastName, int roleId, String email, String password, LocalDateTime dateOfBirth) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = roleId;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roleId=" + roleId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", regDate=" + regDate +
                '}';
    }
}
