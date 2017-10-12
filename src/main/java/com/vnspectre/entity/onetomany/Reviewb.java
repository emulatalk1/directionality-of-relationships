package com.vnspectre.entity.onetomany;

import javax.persistence.*;

@Entity
@Table(name = "reviewb")
public class Reviewb {

    private Long id;
    private String comment;
    private Comicb comicb;

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

    @ManyToOne
    @JoinColumn(name = "fk_comicb")
    public Comicb getComicb() {
        return comicb;
    }

    public void setComicb(Comicb comicb) {
        this.comicb = comicb;
    }
}
