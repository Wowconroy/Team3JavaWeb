package org.teamwork.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id", nullable = false)
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userRole")
    private List<User> usersRole;

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
        return "UserRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
