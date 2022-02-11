package org.teamwork.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user_db")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name")
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message="Please Enter your name")
    private String firstName;

    @Column(name = "last_name")
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message="Please Enter your last name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @NotEmpty(message="Please Enter role id")
    private UserRole userRole;

    @Column(name = "email")
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message="Please Enter your email")
    private String email;

    @Column(name = "password")
    @Size(max = 20, min = 5, message = "{user.name.invalid}")
    @NotEmpty(message="Please Enter your password")
    private String password;

    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;

    @Column(name = "registration_date")
    private LocalDateTime regDate;

    public User() {
        super();
    }

    public User(String firstName, String lastName, UserRole userRole, String email, String password, LocalDateTime dateOfBirth, LocalDateTime regDate) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.regDate = regDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public UserRole userRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
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

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roleId=" + userRole +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", regDate=" + regDate +
                '}';
    }
}
