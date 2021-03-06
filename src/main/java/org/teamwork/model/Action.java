package org.teamwork.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "action")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "act_id", nullable = false)
    private Long actId;

    @Column(name = "action_name")
    private String name;

    public Long getActId() {
        return actId;
    }

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
