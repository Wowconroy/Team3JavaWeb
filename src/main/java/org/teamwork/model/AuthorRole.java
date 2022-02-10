package org.teamwork.model;

import javax.persistence.*;

@Entity
@Table(name = "author_role")
public class AuthorRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_role_id", nullable = false)
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "AuthorRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
