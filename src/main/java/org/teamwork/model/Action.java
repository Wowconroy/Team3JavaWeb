package org.teamwork.model;

import javax.persistence.*;

@Entity
@Table(name = "action")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "act_id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String roleName) {
        this.name = roleName;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
