package org.teamwork.model;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "first_name")
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    private String firstName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_role_id")
    private AuthorRole authorRole;

    @Column(name = "last_name")
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    private String lastName;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public AuthorRole getAuthorRole() {
        return authorRole;
    }

    public void setAuthorRole(AuthorRole authorRole) {
        this.authorRole = authorRole;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
