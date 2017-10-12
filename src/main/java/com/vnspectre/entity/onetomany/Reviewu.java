package com.vnspectre.entity.onetomany;

import javax.persistence.*;

@Entity
@Table(name = "reviewu")
public class Reviewu {

    private Long id;
    private String comment;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
