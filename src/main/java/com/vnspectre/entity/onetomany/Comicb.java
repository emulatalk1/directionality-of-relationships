package com.vnspectre.entity.onetomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Comicb")
public class Comicb {

    private Long id;
    private int chaper;
    private String title;
    private List<Reviewb> reviewbs;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getChaper() {
        return chaper;
    }

    public void setChaper(int chaper) {
        this.chaper = chaper;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "comicb")
    public List<Reviewb> getReviewbs() {
        return reviewbs;
    }

    public void setReviewbs(List<Reviewb> breviews) {
        this.reviewbs = breviews;
    }
}
