package com.vnspectre.entity.onetomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "comicu")
public class Comicu {

    private Long id;
    private int chaper;
    private String title;
    private List<Reviewu> reviewus;

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

    @OneToMany
    @JoinColumn(name = "fk_comicu")
    public List<Reviewu> getReviewus() {
        return reviewus;
    }

    public void setReviewus(List<Reviewu> reviewus) {
        this.reviewus = reviewus;
    }
}
